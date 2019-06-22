package com.example.tests.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.tests.models.Customer;
import com.example.tests.models.Orders;

public interface CustomerRepo extends JpaRepository<Customer, Long>{

	@Query("SELECT c FROM Customer c WHERE custId =:custId")
	public Customer findByCustId(@Param("custId") Long custId);
	
	@Query("SELECT c FROM Customer c ")
	public List<Customer> findAllCustomers();
	
	@Query("SELECT c.order FROM Customer c where c.custId=:custId")
	List<Orders> findOrderList(@Param("custId") Long custId);
}
