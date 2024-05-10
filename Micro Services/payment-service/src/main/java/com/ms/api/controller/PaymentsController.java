package com.ms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.api.dto.PaymentLoginDetalsDto;
import com.ms.api.entity.PaymentDetails;
import com.ms.api.service.PaymentsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name="Payments Controller",description = "Operation on user payments")
public class PaymentsController {

	@Autowired
	PaymentsService paymentsService;
	
	@PostMapping("/netbanking/register")
	@Operation(summary="New NetBanking Registraiton")
	public String netBankingRegistration(@RequestBody PaymentDetails netBankUserDto) {
		System.out.println(netBankUserDto);
	
	return 	paymentsService.netBankingRegister(netBankUserDto);
	}
	
	@PostMapping("/netbanking/login")
	@Operation(summary="Net Banking Login")
	public String netBankingLogin(@RequestBody PaymentLoginDetalsDto paymentLoginDto) {
		System.out.println(paymentLoginDto);
	return 	paymentsService.netBankingLogin(paymentLoginDto);
	}
	
	@GetMapping("/banking/options")
	@Operation(summary="Available Banking options")
	public List<String> bankingOpitonsAvailabel(){
		return List.of("CC","DC","Net Banking","Upi");
	}
}
