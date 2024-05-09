package com.ms.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsDto {
	
	private String email;
	private String name;
	private String password;
	private String contact;
	private String city;
	private String gender;

}
