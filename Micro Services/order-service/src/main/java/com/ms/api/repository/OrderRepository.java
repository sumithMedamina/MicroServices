package com.ms.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.api.entity.OrderDetails;

public interface OrderRepository extends JpaRepository<OrderDetails, String> {

}
