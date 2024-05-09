package com.ms.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.api.dto.OrderDetailsDto;
import com.ms.api.entity.OrderDetails;
import com.ms.api.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	public String orderCreated(OrderDetailsDto orderDto) {
		
		orderRepository.save(OrderDetails.builder()
				.orderId(orderDto.getOrderId())
				.email(orderDto.getEmail())
				.name(orderDto.getName())
				.contact(orderDto.getContact())
				.amount(orderDto.getAmount())
				.build());
		
		return "Order Created succesfully";
	}
	
	public String orderUpdated(OrderDetailsDto orderDto) {
		
		OrderDetails existingOrder = orderRepository.findById(orderDto.getOrderId())
				.orElseThrow(() -> new RuntimeException("Order Not Found"));
		
		if (orderDto.getEmail() != null) {
	        existingOrder.setEmail(orderDto.getEmail());
	    }
	    if (orderDto.getName() != null) {
	        existingOrder.setName(orderDto.getName());
	    }
	    if (orderDto.getContact() != null) {
	        existingOrder.setContact(orderDto.getContact());
	    }
	    if (orderDto.getAmount() != null) {
	        existingOrder.setAmount(orderDto.getAmount());
	    }

		
		orderRepository.save(existingOrder);
		
		return "Order updated Succesfully";
		
	}
	
	public String orderDeleted(String orderId) {
		orderRepository.deleteById(orderId);
		return "Order Deleted Succesfully";
	}
	

}
