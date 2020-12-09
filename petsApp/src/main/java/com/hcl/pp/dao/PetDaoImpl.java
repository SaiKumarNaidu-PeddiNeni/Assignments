package com.hcl.pp.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.pp.appexception.AppException;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

@Repository
public class PetDaoImpl implements PetDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public Pet savePet(Pet pet, User user) throws AppException{
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);

		return null;
	}

}
