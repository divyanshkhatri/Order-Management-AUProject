package com.accolite.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.accolite.model.Customer;
import com.accolite.utils.Connection;

public class CustomerDAOImpl implements CustomerDAO {

	public Customer save(Customer customer) {
		
		Session session = Connection.getSession();
		
		Transaction tx = session.beginTransaction();
		
		Customer customerData = new Customer();
		
		customerData.setCustomerId(customer.getCustomerId());
		customerData.setCustomerEmail(customer.getCustomerEmail());
		customerData.setCustomerAddress(customer.getCustomerAddress());
		customerData.setCustomerName(customer.getCustomerName());
		customerData.setCustomerPhone(customer.getCustomerPhone());
		customerData.setCustomerPincode(customer.getCustomerPincode());
		
		 session.save(customerData);
         tx.commit();
		
		return customerData;
		// TODO Auto-generated method stub

	}

	public List<Customer> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
