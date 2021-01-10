/**
 * 
 */
package com.bankproj.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bankproj.model.Customer;

/**
 * @Sai Kumar Naidu (51897496)
 *
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	/* (non-Javadoc)
	 * @see com.bankproj.dao.CustomerDao#register(com.bankproj.model.Customer)
	 */
	public Customer register(Customer customer) {
		
		Session session = sessionFactory.openSession();
		System.out.println("in customer Dao");
		session.save(customer);		
		return customer;
	}

}
