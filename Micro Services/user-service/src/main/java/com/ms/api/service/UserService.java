package com.ms.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.api.dto.UserCredentials;
import com.ms.api.dto.UserDetailsDto;
import com.ms.api.entity.UserDetails;
import com.ms.api.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public String UserRegistration(UserDetailsDto userDetailsDto) {
		
		userRepository.save(UserDetails.builder()
				.email(userDetailsDto.getEmail())
				.name(userDetailsDto.getName())
				.password(userDetailsDto.getPassword())
				.contact(userDetailsDto.getContact())
				.city(userDetailsDto.getCity())
				.gender(userDetailsDto.getGender())
				.build());
		
		return "User Created Succesfully";
	}

	public UserDetails userLogin(UserCredentials userCredentials) {
		
		return userRepository.findByEmailAndPassword(userCredentials.getEmail(),userCredentials.getPassword());
	}
	
}
