package com.example.tests.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.tests.models.Customer;
import com.example.tests.models.Orders;
import com.example.tests.repo.CustomerRepo;
import com.example.tests.repo.OrderRepo;

@Component
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo orderRepo;
	@Autowired
	CustomerRepo custRepo;
	
	
	@Override
	public void saveOrder(Orders order,Long id) {
		// TODO Auto-generated method stub
		Customer customer = custRepo.findByCustId(id);
		order.setCustomer(customer);
		orderRepo.save(order);
		//return "Order is Placed Successfully";
	}

	@Override
	public List<Orders> showOrders() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
	}

	@Override
	public List<Orders> getOrdersById(Long id) {
		// TODO Auto-generated method stub
		return custRepo.findOrderList( id);
	}

}
