package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;*/
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User;
//import com.service.UserService;

@Repository
public class UserDaoImpl implements UserDao {

	/*@Autowired
	private UserService userService;*/
	/*@Autowired
	private JdbcTemplate jdbcTemplate;

	public UserDaoImpl(DataSource dataSource)
	{
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}*/
	@Override
	public User read(User user) {
		System.out.println("daofront");
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
				System.out.println(user.getUserName());
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	
	}

}
