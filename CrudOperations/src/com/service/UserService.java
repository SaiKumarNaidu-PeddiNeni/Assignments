package com.service;
import appexception.AppException;
import model.User;

public interface UserService {
	
	 User validate(User user) throws AppException;
	 
	 User create(User user)throws AppException;

	User delete(User user) throws AppException; 

	//User validate(int userId, String password) throws AppException;

}
