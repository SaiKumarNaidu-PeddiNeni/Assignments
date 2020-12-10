package com.hcl.pp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.pp.appexception.AppException;
import com.hcl.pp.dao.UserDao;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public User addUser(User user) throws AppException {

		System.out.println(" in the service Layer");

		return userDao.addUser(user);
	}

	@Override
	@Transactional
	public User findByUserName(User user) throws AppException {

		return userDao.findByUserName(user);
	}

	@Override
	@Transactional
	public User removee(User user) throws AppException {

		return userDao.remove(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hcl.pp.service.UserService#getMyPets(com.hcl.pp.model.User)
	 */
	@Override
	@Transactional
	public List<Pet> getMyPets(User user) throws AppException {

		List<Pet> pets = new ArrayList<Pet>();

		pets = userDao.getMyPets(user);

		return pets;
	}

	/* (non-Javadoc)
	 * @see com.hcl.pp.service.UserService#getAllUsers(com.hcl.pp.model.User)
	 */
	@Override
	@Transactional
	public List<User> getAllUsers() throws AppException {
		
		return userDao.getAllUsers();
	}

}
