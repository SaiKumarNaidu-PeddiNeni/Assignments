package com.dao;


import com.model.User;

public interface UserDao {
	
	
	
	public abstract User create(User user);
	
	public abstract User read(User user);
	
	public abstract User remove(User user);
	

}
