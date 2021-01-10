/**
 * 
 */
package com.bankproj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankproj.dao.CustomerDao;
import com.bankproj.model.Customer;

/**
 * @Sai Kumar Naidu (51897496)
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao; 

	/* (non-Javadoc)
	 * @see com.bankproj.service.CustomerService#register(com.bankproj.dao.Customer)
	 */
	public Customer register(Customer customer) {
		System.out.println("in customer service");
		return customerDao.register(customer);
	}

}
