package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	public static Connection getConnection() {
		Connection con = null;
		// Statement stmt = null;
		// ResultSet rs = null;
		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/mydatabase2?autoReconnect=true&useSSL=false";
			Class.forName(driverName);
			con = DriverManager.getConnection(url, "root", "Args@123");
			System.out.println(con != null ? "connection established" : "connection failed");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("There is no respective jars : " + cnfe.getMessage());
		} catch (SQLException se) {// Catching SQL Exception
			System.out.println("SQL Exception :" + se.getMessage() + "1");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
