package com.accolite.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.model.CustomerOrder;
import com.accolite.service.CustomerOrderService;

@RestController
public class OrderController {

	@CrossOrigin
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/createorder", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = "application/json") 
	public ResponseEntity<CustomerOrder> createOrder(@RequestBody CustomerOrder customerOrder) throws Exception {
		System.out.println("Order: "+ customerOrder);
		CustomerOrder response = CustomerOrderService.createOrder(customerOrder);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
}
