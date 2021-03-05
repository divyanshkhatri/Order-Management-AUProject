package com.accolite.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.accolite.model.Product;
import com.accolite.utils.Connection;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public Product save(Product product) {
		
		
		Session session = Connection.getSession();
		
		Transaction tx = session.beginTransaction();
	
//		Product productData = new Product();
//		
//		productData.setProductId(product.getProductId());
//		productData.setProductName(product.getProductName());
//		productData.setProductOnHand(product.getProductOnHand());
//		productData.setProductAvailable(product.getProductAvailable());
//		productData.setProductOutgoing(product.getProductOutgoing());
//		productData.setProductIncoming(product.getProductIncoming());
//		productData.setProductcostPrice(product.getProductcostPrice());
//		productData.setProductSellingPrice(product.getProductSellingPrice());
	

		 session.save(product);
         tx.commit();
		
		return product;
		
	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
