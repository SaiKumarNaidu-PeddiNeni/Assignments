package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public User create(User user) {

		System.out.println(" in the service Layer");

		return userDao.create(user);
	}

	@Override
	@Transactional
	public User read(User user) {

		return userDao.read(user);
	}

	@Override
	@Transactional
	public User removee(User user) {
		
		return userDao.remove(user);
	}

}
