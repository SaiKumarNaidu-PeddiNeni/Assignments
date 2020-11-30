package com.dao;

import appexception.AppException;
import model.User;

public interface UserDao {
	
	User read(User user) throws AppException;
	
	User create(User user)throws AppException;
	
	User delete(User user)throws AppException;

}
