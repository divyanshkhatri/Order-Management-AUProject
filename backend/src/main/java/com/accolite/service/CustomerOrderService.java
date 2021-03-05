package com.accolite.service;

import org.springframework.stereotype.Service;

import com.accolite.dao.CustomerOrderDAOImpl;
import com.accolite.model.CustomerOrder;
import com.accolite.model.Order;

@Service
public class CustomerOrderService {
	
	public static CustomerOrder createOrder(Order order) {
		
		CustomerOrderDAOImpl customerOrderImpl = new CustomerOrderDAOImpl();
		
		CustomerOrder customerOrderData = customerOrderImpl.save(order);
		
		return customerOrderData;
		
	}

}
