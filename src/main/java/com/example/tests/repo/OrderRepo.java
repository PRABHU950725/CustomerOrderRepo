package com.example.tests.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tests.models.Orders;

public interface OrderRepo extends JpaRepository<Orders, Long> {

}
