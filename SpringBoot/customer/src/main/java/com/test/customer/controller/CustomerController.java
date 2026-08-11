package com.test.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.test.customer.entity.Customer;
import com.test.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService custservice;
	
	@PostMapping("/save")
	public List<Customer> save(@RequestBody List<Customer> cust) {
		return custservice.saveCustomer(cust);
	}
	
	@GetMapping("/all")
	public List<Customer> getAll(){
		return custservice.getAllCustomers();
	}
	
	@GetMapping("/{id}")
	public Customer getById(@PathVariable int id) {
		return custservice.getCustomer(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable int id) {
		return custservice.deleteCustomer(id);
	}
	
	

}
