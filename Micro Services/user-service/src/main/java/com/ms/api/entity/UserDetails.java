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
@Table(name="flp_users")
public class UserDetails {
	
	
	@Id
	private String email;
	private String name;
	private String password;
	private String contact;
	private String city;
	private String gender;

}
