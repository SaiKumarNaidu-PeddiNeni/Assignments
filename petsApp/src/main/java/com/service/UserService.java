package com.service;

import com.model.User;

public interface UserService {
	
	public abstract User create(User user);
	
	public abstract User read(User user);
	
	public abstract User removee(User user);
	

}
