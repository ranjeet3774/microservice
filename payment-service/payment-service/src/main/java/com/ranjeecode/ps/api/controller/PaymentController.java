package com.ranjeecode.ps.api.controller;

import com.ranjeecode.ps.api.PaymentServiceApplication;
import com.ranjeecode.ps.api.entity.Payment;
import com.ranjeecode.ps.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService service;
    @RequestMapping ("/doPayment")
    public Payment doPayment(@RequestBody Payment payment){
        return service.doPayment(payment);
    }

    @GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOrderId(@PathVariable int orderId){

        Payment payment =  service.finnPaymentHistoryByOrderId(orderId);

        return payment;
    }
}
