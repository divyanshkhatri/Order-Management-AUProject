package com.accolite.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.model.Customer;
import com.accolite.service.CustomerService;

@RestController
public class CustomerController {
	
	@CrossOrigin
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/createcustomer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = "application/json") 
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) throws Exception {
		System.out.println("Order: "+ customer);
		Customer response = CustomerService.createCustomer(customer);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
}
