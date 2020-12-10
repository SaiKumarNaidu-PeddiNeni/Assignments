package com.hcl.pp.dao;

import java.util.ArrayList;
import java.util.List;

//import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

//import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.pp.appexception.AppException;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User addUser(User user) throws AppException {
		System.out.println("in the dao layer");
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		return user;
	}

	@Override
	public User findByUserName(User user) throws AppException {

		
		Session session = sessionFactory.getCurrentSession();
		
		try {
		String hql = "SELECT userId FROM User user WHERE user.userName=:userName and user.password=:password";
		
		Query query = session.createQuery(hql);
		query.setString("userName", user.getUserName());
		query.setString("password", user.getPassword());

		int userId = (int) query.uniqueResult();
		user.setUserId(userId);
		}
		catch(Exception e){
			user.setUserId(null);
			
			
		}
		
		return user;
	}

	@Override
	public User remove(User user) throws AppException {

		String hql = "SELECT userId FROM User user WHERE user.userName=:userName and user.password=:password";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setString("userName", user.getUserName());
		query.setString("password", user.getPassword());
		int userId = (int) query.uniqueResult();

		user.setUserId(userId);

		if (user.getUserId() == null) {
			throw new AppException("Incorrect User Name or Password ");
		} else {
			session.delete(user);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.hcl.pp.dao.UserDao#getMyPets(com.hcl.pp.model.User)
	 */
	@Override
	public List<Pet> getMyPets(User user) throws AppException {
		
		String hql = "SELECT userId FROM User user WHERE user.userName=:userName and user.password=:password";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setString("userName", user.getUserName());
		query.setString("password", user.getPassword());
		int userId = (int) query.uniqueResult();
		
		
		user.setUserId(userId);
		String hql_Pet = "SELECT * FROM Pet pet WHERE owner_userId="+user.getUserId();
		Query query_Pet = session.createQuery(hql_Pet);
		query_Pet.setInteger(userId, user.getUserId());
		List<Pet> pets = new ArrayList<Pet>();
		pets = query.getResultList();	
		return pets;
	}

	/* (non-Javadoc)
	 * @see com.hcl.pp.dao.UserDao#getAllUsers(com.hcl.pp.model.User)
	 */
	@Override
	public List<User> getAllUsers() throws AppException {
		
		String nativeQuery= "SELECT * FROM USER";
		Session session = sessionFactory.getCurrentSession();
		List<User> userList  =  session.createNativeQuery(nativeQuery).addEntity(User.class).list();	
		System.out.println("1");
		for(User user : userList)
		{
			System.out.println("1");
			System.out.println(user.getUserName());
		}
		return userList;
	}

}
