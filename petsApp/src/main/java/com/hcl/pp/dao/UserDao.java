package com.hcl.pp.dao;


import java.util.List;

import com.hcl.pp.appexception.AppException;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

public interface UserDao {
	
	public abstract User addUser(User user) throws AppException;
	
	public abstract User findByUserName(User user)throws AppException;
	
	public abstract User remove(User user)throws AppException;
	
	public abstract List<Pet> getMyPets(User user) throws AppException;
	
	public abstract List<User> getAllUsers() throws AppException;

}
