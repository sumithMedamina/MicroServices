package com.ms.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailsDto {

	private String orderId;
	private String email;
	private String name;
	private String contact;
	private Double amount;
	
}