package com.ranjeecode.ps.api.repository;

import com.ranjeecode.ps.api.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository  extends JpaRepository<Payment,Integer> {
    Payment findByOrderId(int orderId);
}
