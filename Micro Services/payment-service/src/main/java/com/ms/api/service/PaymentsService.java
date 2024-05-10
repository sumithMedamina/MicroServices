package com.ms.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.api.dto.NetBankingUserDetailsDto;
import com.ms.api.dto.PaymentLoginDetalsDto;
import com.ms.api.entity.PaymentDetails;
import com.ms.api.repository.PaymentDetailsRepository;

@Service
public class PaymentsService {
	
	@Autowired
	private PaymentDetailsRepository paymentDetailsRepository;
	
	public String netBankingRegister(PaymentDetails netBankingUserDetailsDto) {
		
		PaymentDetails pam  = new PaymentDetails();
		pam.setUserId(netBankingUserDetailsDto.getUserId());
		pam.setName(netBankingUserDetailsDto.getName());
		pam.setPassword(netBankingUserDetailsDto.getPassword());
		pam.setAvailabelBalance(netBankingUserDetailsDto.getAvailabelBalance());
		
		paymentDetailsRepository.save(pam);
		
		
		return "NetBanking User Registerd Success, Login now!!!";
		
	}
	
	
	public String netBankingLogin(PaymentLoginDetalsDto paymentLoginDetailsDto) {
		
		PaymentDetails data = paymentDetailsRepository.findByUserIdAndPassword(paymentLoginDetailsDto.getUserId(),
				paymentLoginDetailsDto.getPassword());
		
		if(data!=null) {
			return "Net Banking Login Success!!";
		}
		else {
			return "Net Banking Login Failed";
		}
		
	}

}
