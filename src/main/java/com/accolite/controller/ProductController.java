package com.accolite.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.model.Product;
import com.accolite.service.ProductService;


@RestController
public class ProductController {
	
	@CrossOrigin
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/createproduct", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = "application/json") 
	public ResponseEntity<Product> createProdict(@RequestBody Product product) throws Exception {
		System.out.println("Product: "+ product);
		Product response = ProductService.createProduct(product);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	

}
