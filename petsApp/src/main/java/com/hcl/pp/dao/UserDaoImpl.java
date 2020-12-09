package com.hcl.pp.dao;

import java.util.List;

import javax.transaction.Transactional;

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
	@Transactional
	public User addUser(User user) throws AppException {
		System.out.println("in the dao layer");
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		return user;
	}

	@Override
	@Transactional
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
	@Transactional
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
		return null;
	}

}
