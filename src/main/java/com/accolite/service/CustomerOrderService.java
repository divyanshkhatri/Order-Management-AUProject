package com.accolite.service;

import org.springframework.stereotype.Service;

import com.accolite.dao.CustomerOrderDAOImpl;
import com.accolite.model.CustomerOrder;

@Service
public class CustomerOrderService {
	
	public static CustomerOrder createOrder(CustomerOrder customerOrder) {
		
		CustomerOrderDAOImpl customerOrderImpl = new CustomerOrderDAOImpl();
		
		CustomerOrder customerOrderData = customerOrderImpl.save(customerOrder);
		
		return customerOrderData;
		
	}

}
