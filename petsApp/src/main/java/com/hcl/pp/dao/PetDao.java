package com.hcl.pp.dao;

import java.util.List;

import com.hcl.pp.appexception.AppException;
import com.hcl.pp.model.Pet;
//import com.hcl.pp.model.User;

public interface PetDao {
	
	public Pet addPet(Pet pet) throws AppException ;
	
	public abstract List<Pet> getAllPets() throws AppException;
}
