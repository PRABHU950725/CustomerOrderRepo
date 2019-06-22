package com.example.tests.service;

import java.util.List;

import com.example.tests.models.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomer();

	public String addCustomer(Customer customer);

}
