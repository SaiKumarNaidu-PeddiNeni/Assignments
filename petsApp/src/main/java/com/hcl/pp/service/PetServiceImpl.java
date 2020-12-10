package com.hcl.pp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.pp.appexception.AppException;
import com.hcl.pp.dao.PetDao;
import com.hcl.pp.model.Pet;
//import com.hcl.pp.model.User;

@Service
public class PetServiceImpl implements PetService {

	@Autowired
	private PetDao petDao;

	@Override
	@Transactional
	public Pet addPet(Pet pet) throws AppException{

		return petDao.addPet(pet);
	}

	/* (non-Javadoc)
	 * @see com.hcl.pp.service.PetService#getAllPets()
	 */
	@Override
	@Transactional
	public List<Pet> getAllPets() throws AppException {
		
		
		return petDao.getAllPets();
	}

}
