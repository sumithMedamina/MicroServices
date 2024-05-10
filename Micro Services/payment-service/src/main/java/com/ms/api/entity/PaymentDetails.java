package com.ms.api.entity;	


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name="flp_Payments")
public class PaymentDetails {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String userId;
	private String name;
	private String password;
	private Double availabelBalance;

}
