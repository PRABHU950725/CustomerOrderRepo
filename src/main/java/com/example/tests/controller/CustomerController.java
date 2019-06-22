package com.example.tests.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tests.models.Customer;
import com.example.tests.service.CustomerService;

@RestController
@RequestMapping("/rest")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		
		return customerService.getCustomer();
		
	}
	
	@PostMapping("/customers/add")
	public String addCustomer(@RequestBody Customer customer){
		return customerService.addCustomer(customer);
		
	}
}
