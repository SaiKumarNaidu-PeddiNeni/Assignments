package com.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

//import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User;


@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public User create(User user)
	{
		System.out.println("in the dao layer");
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		return user;
	}


	@Override
	@Transactional
	public User read(User user) {
		
		String hql = "SELECT userId FROM User user WHERE user.userName=:userName and user.password=:password";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setString("userName",user.getUserName());
		query.setString("password",user.getPassword());
		
		int userId = (int)query.uniqueResult();
		
		user.setUserId(userId);
		
	
		
		return user;
	}


	@Override
	@Transactional
	public User remove(User user) {
		
		Session session = sessionFactory.getCurrentSession();
		session.delete(user);
			
		return null;
	}

}
