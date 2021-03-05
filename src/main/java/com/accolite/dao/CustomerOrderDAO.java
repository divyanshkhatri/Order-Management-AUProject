package com.accolite.dao;

import java.util.List;

import com.accolite.model.CustomerOrder;
import com.accolite.model.Order;
import com.accolite.model.Product;

public interface CustomerOrderDAO {
	
	public CustomerOrder save(Order order);
	
	public List<Product> fetch();

}
