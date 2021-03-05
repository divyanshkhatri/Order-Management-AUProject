package com.accolite.service;

import com.accolite.dao.ProductDAOImpl;
import com.accolite.model.Product;

public class ProductService {
	
	
public static Product createProduct(Product product) {
		
		ProductDAOImpl productDAOImpl = new ProductDAOImpl();
		
		Product productData = productDAOImpl.save(product);
		
		return productData;
		
	}


}
