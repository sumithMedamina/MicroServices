package com.ms.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.api.entity.PaymentDetails;


@Repository
public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails, String> {

	PaymentDetails findByUserIdAndPassword(String userId, String password);

}
