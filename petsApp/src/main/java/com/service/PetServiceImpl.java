package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.PetDao;
import com.model.Pet;

@Service
public class PetServiceImpl implements PetService {

	@Autowired
	private PetDao petDao;

	@Override
	@Transactional
	public Pet savePet(Pet pet) {

		return petDao.savePet(pet);
	}

}
