package com.hcl.pp.dao;

import com.hcl.pp.appexception.AppException;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

public interface PetDao {
	
	public Pet savePet(Pet pet, User user) throws AppException ;
}
