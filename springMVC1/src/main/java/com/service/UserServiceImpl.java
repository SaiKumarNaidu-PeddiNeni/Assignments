package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User read(User user) {

		if (user.getUserId() > 0 && user.getPassword().length()>0) {

			user = userDao.read(user);
		}

		return user;
	}

}
