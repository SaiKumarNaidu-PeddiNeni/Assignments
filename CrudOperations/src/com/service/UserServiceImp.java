package com.service;

import com.dao.UserDao;
import com.dao.UserDaoImp;

import appexception.AppException;
import model.User;
import com.dao.UserDaoImp;
import com.dao.UserDao;

public class UserServiceImp implements UserService {

	@Override
	public User validate(User user) throws AppException {
		if (Integer.toString(user.getUserId()).length() >= 6 && user.getPassword() != null && user.getPassword().length() > 5) {
			// System.out.println("In UserServiceImp");
			UserDao userdao = (UserDao) new UserDaoImp();
			user = userdao.read (user);
		} else {
			throw new AppException("Validation Fail!!");
		}
		return user;
	}
	@Override
	public User create(User user) throws AppException {
		if (Integer.toString(user.getUserId()).length() >= 6 && user.getPassword() != null && user.getPassword().length() > 5 && user.getUserName().length()>5) {
			// System.out.println("In UserServiceImp");
			UserDao userdao = (UserDao) new UserDaoImp();
			userdao.create(user);
		} else {
			throw new AppException("Validation Fail!!");
		}
		return user;	
	}
	
	@Override
	public User delete(User user) throws AppException {
		if (Integer.toString(user.getUserId()).length() >= 6 && user.getPassword() != null && user.getPassword().length() > 5) {
			// System.out.println("In UserServiceImp");
			UserDao userdao = (UserDao) new UserDaoImp();
			user = userdao.delete(user);
		} else {
			throw new AppException("Validation Fail!!");
		}
		return user;
	}
}
