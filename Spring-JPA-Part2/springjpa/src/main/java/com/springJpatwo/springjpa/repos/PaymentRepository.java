package com.springJpatwo.springjpa.repos;

import com.springJpatwo.springjpa.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {
}