package com.hcl.pp.service;

import com.hcl.pp.appexception.AppException;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

public interface PetService {
	
	
	
	public abstract Pet savePet(Pet pet,User user)throws AppException;
	
	

}
