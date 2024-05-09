package com.ms.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="order_details")
public class OrderDetails {
	
	@Id
	private String orderId;
	private String email;
	private String name;
	private String contact;
	private Double amount;

}
