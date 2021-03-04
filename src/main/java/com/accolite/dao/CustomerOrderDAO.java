package com.accolite.dao;

import java.util.List;

import com.accolite.model.CustomerOrder;
import com.accolite.model.Product;

public interface CustomerOrderDAO {
	
	public CustomerOrder save(CustomerOrder customerOrder);
	
	public List<Product> fetch();

}
