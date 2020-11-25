package com.service;

import com.dao.UserDao;
import com.dao.UserDaoImp;

import appexception.AppException;
import model.User;

public class UserServiceImp implements UserService {

	@Override
	public User createUser(int user_Id, String password, String user_name) throws AppException {
		User user = null;
		if (Integer.toString(user_Id).length() >= 6 && password.length() > 5 && user_name.length() > 6) {
			// System.out.println("In UserServiceImp");
			UserDao userdao = new UserDaoImp();
			user = userdao.createUser(user_Id, password,user_name);
		} else {
			throw new AppException("Validation Fail!!");
		}
		return user;
	}

	@Override
	public User readUserById(int userId) throws AppException {
		return null;
	}

	@Override
	public User readUserByName(String userName) throws AppException {
		return null;
	}

	@Override
	public User readUserByIdAndPassword(int user_Id, String password) throws AppException {

		User user = null;
		if (Integer.toString(user_Id).length() >= 6 && password != null && password.length() > 5) {
			// System.out.println("In UserServiceImp");
			UserDao userdao = new UserDaoImp();
			user = userdao.readUserByIdAndPassword(user_Id, password);
		} else {
			throw new AppException("Validation Fail!!");
		}
		return user;
	}

	@Override
	public User updateUser(User user) {
		return null;
	}

	@Override
	public boolean deleteUserById(int user_Id) {
		boolean deletion = false;
		if (Integer.toString(user_Id).length() >= 6) {
			// System.out.println("In UserServiceImp");
			UserDao userdao = new UserDaoImp();
		deletion = userdao.deleteUserById(user_Id);
		} 
		return deletion;
		
		
	}
}
