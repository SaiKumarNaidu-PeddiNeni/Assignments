package com.hcl.pp.dao;

//import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.pp.appexception.AppException;
import com.hcl.pp.model.Pet;
//import com.hcl.pp.model.User;

@Repository
public class PetDaoImpl implements PetDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public Pet addPet(Pet pet) throws AppException{
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(pet);

		return null;
	}


	/* (non-Javadoc)
	 * @see com.hcl.pp.dao.PetDao#getAllPets()
	 */
	@Override
	public List<Pet> getAllPets() throws AppException {
		
		String nativeQuery= "SELECT * FROM PET";
		Session session = sessionFactory.getCurrentSession();
		List<Pet> pets  =  session.createNativeQuery(nativeQuery).addEntity(Pet.class).list();
		
	
		return pets;
	}

}
