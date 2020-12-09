package com.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Pet;

@Repository
public class PetDaoImpl implements PetDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public Pet savePet(Pet pet) {

		return null;
	}

}
