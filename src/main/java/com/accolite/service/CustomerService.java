package com.accolite.service;

import org.springframework.stereotype.Service;

import com.accolite.dao.CustomerDAOImpl;
import com.accolite.model.Customer;

@Service
public class CustomerService {
	
	public static Customer createCustomer(Customer customer) {
		
		CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
		
		Customer customerData = customerDAOImpl.save(customer);
		
		return customerData;
		
	}

}
