package com.example.tests.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.tests.models.Orders;

public interface OrderService {
	
	public void saveOrder(@RequestBody Orders order,Long id);
	public List<Orders> showOrders();
	public List<Orders> getOrdersById(Long id);

}
