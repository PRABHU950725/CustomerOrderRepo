package com.example.tests.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.tests.models.Customer;
import com.example.tests.repo.CustomerRepo;
@Component
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo customerRepo;
	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerRepo.findAllCustomers();
	}
	@Override
	public String addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
			 customerRepo.save(customer);
			 
			 return "Customer Record added successfully";
	}

}
