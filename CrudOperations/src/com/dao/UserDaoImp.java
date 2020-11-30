package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.service.UserService;

import appexception.AppException;
import model.User;

public class UserDaoImp implements UserDao {

	@Override
	public User read(User user) {
		Connection connection = MyConnection.getConnection();
		ResultSet resultSet = null;
		//User user = null;
		String query = "select * from user where user_Id=? and password=?";
		try {
			// System.out.println("In UserDaoImp");
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setInt(1, user.getUserId());
			preparedStatement.setString(2, user.getPassword());
			resultSet = preparedStatement.executeQuery();
			user = new User();
			while (resultSet.next()) {
				user.setUserId(resultSet.getInt("user_Id"));
				user.setPassword(resultSet.getString("password"));
				user.setUserName(resultSet.getString("user_name"));
				//System.out.println(user.getUserName());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	
	}

	@Override
	public User create(User user) throws AppException
	{
	Connection connection = MyConnection.getConnection();
	//ResultSet resultSet = null;
	//User user = null;
	String query = "INSERT INTO user(user_Id,password,user_name) VALUES (?,?,?)";
	try {
		// System.out.println("In UserDaoImp");
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
		preparedStatement.setInt(1, user.getUserId());
		preparedStatement.setString(2, user.getPassword());
		preparedStatement.setString(3, user.getUserName());
		preparedStatement.executeUpdate();
		/*resultSet = preparedStatement.executeQuery();
		user = new User();
		while (resultSet.next()) {
			user.setUserId(resultSet.getInt("user_Id"));
			user.setPassword(resultSet.getString("password"));
			user.setUserName(resultSet.getString("user_name"));
			//System.out.println(user.getUserName());
		}*/
	} catch (SQLException e) {
		e.printStackTrace();
	}

	return user;
	}

	@Override
	public User delete(User user) throws AppException
	{
	Connection connection = MyConnection.getConnection();
	//ResultSet resultSet = null;
	//User user = null;
	String query = "DELETE FROM user WHERE user_ID = ? and password = ?";
	try {
		// System.out.println("In UserDaoImp");
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
		preparedStatement.setInt(1, user.getUserId());
		preparedStatement.setString(2, user.getPassword());
		//preparedStatement.setString(3, user.getUserName());
		preparedStatement.executeUpdate();
		/*resultSet = preparedStatement.executeQuery();
		user = new User();
		while (resultSet.next()) {
			user.setUserId(resultSet.getInt("user_Id"));
			user.setPassword(resultSet.getString("password"));
			user.setUserName(resultSet.getString("user_name"));
			//System.out.println(user.getUserName());
		}*/
	} catch (SQLException e) {
		e.printStackTrace();
	}

	return user;
	}

}
