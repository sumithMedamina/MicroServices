package com.ms.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.api.dto.OrderDetailsDto;
import com.ms.api.service.OrderService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "OrderController",description = "Operation on order management")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/create-order")
	@Operation(summary="Creating an order")
	public String createOrder(@RequestBody OrderDetailsDto oDDto) {
		return orderService.orderCreated(oDDto);
	}
	
	@PostMapping("/update-order")
	@Operation(summary="Updating an Existing order")
	public String UpdateOrder(@RequestBody OrderDetailsDto oDDto) {
		return orderService.orderUpdated(oDDto);
	}
	
	@PostMapping("/delete-order/{orderId}")
	@Operation(summary="Deleting an Existing order")
	public String deleteOrder(@PathVariable String orderId) {
		return orderService.orderDeleted(orderId);
	}

}
