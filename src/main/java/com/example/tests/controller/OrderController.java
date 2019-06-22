package com.example.tests.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tests.models.Orders;
import com.example.tests.service.OrderService;

@RestController
@RequestMapping("/rest")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/customers/{id}/orders")
	public String saveOrder(@RequestBody Orders order,@PathVariable Long id) {
		 orderService.saveOrder(order,id);
		 return "Order Saved Successfully";
		
	}
	@GetMapping("/orders/get")
	public List<Orders> getOrders(){
		
		return orderService.showOrders();
	}

	@GetMapping("/customers/{id}/orders")
	public List<Orders> getOrders(@PathVariable Long id) {
		return orderService.getOrdersById(id);
		
	}
}
