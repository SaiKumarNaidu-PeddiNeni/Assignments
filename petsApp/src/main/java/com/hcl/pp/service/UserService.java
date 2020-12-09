package com.hcl.pp.service;

import java.util.List;

import com.hcl.pp.appexception.AppException;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

public interface UserService {

	public abstract User addUser(User user) throws AppException;

	public abstract User findByUserName(User user) throws AppException;

	public abstract User removee(User user) throws AppException;
	
	public abstract List<Pet> getMyPets(User user) throws AppException;
	


}
