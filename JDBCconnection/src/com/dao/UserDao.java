package com.dao;

import model.User;
import appexception.AppException;

public interface UserDao {

	User createUser(User user) throws AppException;

	User readUserById(int userId) throws AppException;

	User readUserByName(String userName) throws AppException;

	User readUserByIdAndPassword(int userId, String password) throws AppException;

	User updateUser(User user);

	boolean deleteUserById(int userId);

	User createUser(int user_Id, String password, String User_name) throws AppException;

}
