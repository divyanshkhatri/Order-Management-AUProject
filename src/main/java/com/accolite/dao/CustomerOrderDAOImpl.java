package com.accolite.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.accolite.model.CustomerOrder;
import com.accolite.model.Product;
import com.accolite.utils.Connection;

public class CustomerOrderDAOImpl implements CustomerOrderDAO {

	@Override
	public CustomerOrder save(CustomerOrder customerOrder) {
		
		Session session = Connection.getSession();
		
		Transaction tx = session.beginTransaction();
		
		CustomerOrder customerOrderData = new CustomerOrder();
		
//		customerOrderData.setCustomerId(customerOrder.getCustomerId());
		customerOrderData.setOrderId(customerOrder.getOrderId());
		customerOrderData.setOrderStatus(customerOrder.getOrderStatus());
	
		session.save(customerOrderData);
		tx.commit();
		
		return customerOrderData;
	}

	@Override
	public List<Product> fetch() {
		// TODO Auto-generated method stub
		return null;
	}

}
