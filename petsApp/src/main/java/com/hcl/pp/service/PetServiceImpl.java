package com.hcl.pp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.pp.appexception.AppException;
import com.hcl.pp.dao.PetDao;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

@Service
public class PetServiceImpl implements PetService {

	@Autowired
	private PetDao petDao;

	@Override
	@Transactional
	public Pet savePet(Pet pet, User user) throws AppException{

		return petDao.savePet(pet,user);
	}

}
