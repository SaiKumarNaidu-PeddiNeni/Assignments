package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import appexception.AppException;
import model.User;

public class UserDaoImp implements UserDao {

	@Override
	public User createUser(int user_Id, String password, String user_name) throws AppException {

		Connection connection = MyConnection.getConnection();
		ResultSet resultSet = null;
		User user = null;
		String query = "INSERT INTO user(user_Id,password,user_name) VALUES (?,?,?)";
		try {
			// System.out.println("In UserDaoImp");
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setInt(1, user_Id);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, user_name);
			preparedStatement.executeUpdate();
			// resultSet = preparedStatement.executeQuery();
			user = new User();
			String Display_query = "select * from user where (user_Id=? and password=?) and user_name=?";
			try {
				// System.out.println("In UserDaoImp");
				PreparedStatement preparedStatement1 = (PreparedStatement) connection.prepareStatement(Display_query);
				preparedStatement1.setInt(1, user_Id);
				preparedStatement1.setString(2, password);
				preparedStatement1.setString(3, user_name);
				resultSet = preparedStatement1.executeQuery();
				// user = new User();
				while (resultSet.next()) {
					user.setUserId(resultSet.getInt("user_Id"));
					user.setPassword(resultSet.getString("password"));
					user.setUserName(resultSet.getString("user_name"));

				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}

	@Override
	public User readUserById(int userId) throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readUserByName(String userName) throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readUserByIdAndPassword(int user_Id, String password) throws AppException {

		Connection connection = MyConnection.getConnection();
		ResultSet resultSet = null;
		User user = null;
		String query = "select * from user where user_Id=? and password=?";
		try {
			// System.out.println("In UserDaoImp");
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setInt(1, user_Id);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			user = new User();
			while (resultSet.next()) {
				user.setUserId(resultSet.getInt("user_Id"));
				user.setPassword(resultSet.getString("password"));
				user.setUserName(resultSet.getString("user_name"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;

	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUserById(int user_Id) {
		boolean deletion = false;
		Connection connection = MyConnection.getConnection();
		/*ResultSet resultSet = null;
		User user = null;*/
		String query = "DELETE FROM user WHERE user_ID = ?";
		try {
			//System.out.println("In UserDaoImp");
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setInt(1, user_Id);
			if(preparedStatement.executeUpdate()==1)
			{
				deletion =true;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return deletion;
	}

	@Override
	public User createUser(User user) throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

}
