package com.ms.api.dto;

import org.springframework.stereotype.Service;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Service
public class NetBankingUserDetailsDto {
	
 
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getAvailabelBalance() {
		return availabelBalance;
	}
	public void setAvailabelBalance(Double availabelBalance) {
		this.availabelBalance = availabelBalance;
	}
	private String userId;
	private String name;
	private String password;
	private Double availabelBalance;
	public NetBankingUserDetailsDto(String userId, String name, String password, Double availabelBalance) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.availabelBalance = availabelBalance;
	}
	public NetBankingUserDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "NetBankingUserDetailsDto [userId=" + userId + ", name=" + name + ", password=" + password
				+ ", availabelBalance=" + availabelBalance + "]";
	}
	
	

}
