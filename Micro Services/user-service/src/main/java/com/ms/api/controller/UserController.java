package com.ms.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.api.dto.UserCredentials;
import com.ms.api.dto.UserDetailsDto;
import com.ms.api.entity.UserDetails;
import com.ms.api.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name="User Controller" , description = "Operation pertaining to User Management")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	@Operation(summary="Register a new User")
	public String UserRegistration(@RequestBody UserDetailsDto dto) {
		
		return userService.UserRegistration(dto);
	}
	
	@PostMapping("/login")
	@Operation(summary="Login as an Existing User")
	public UserDetails userLogin(@RequestBody UserCredentials userCred) {
		return userService.userLogin(userCred);
	}

}
