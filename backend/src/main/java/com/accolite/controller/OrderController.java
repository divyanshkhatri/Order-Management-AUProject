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
import com.accolite.model.Order;
import com.accolite.service.CustomerOrderService;

@RestController
public class OrderController {

	@CrossOrigin
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/createorder", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = "application/json") 
	public ResponseEntity<CustomerOrder> createOrder(@RequestBody Order order) throws Exception {
		System.out.println("Order: "+ order);
		CustomerOrder response = CustomerOrderService.createOrder(order);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
}
