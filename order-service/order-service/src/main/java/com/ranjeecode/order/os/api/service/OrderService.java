package com.ranjeecode.order.os.api.service;

import com.ranjeecode.order.os.api.common.Payment;
import com.ranjeecode.order.os.api.common.TransactionRequest;
import com.ranjeecode.order.os.api.common.TransactionResponse;
import com.ranjeecode.order.os.api.entity.Order;
import com.ranjeecode.order.os.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;
    @Autowired
    private RestTemplate restTemplate;
    public TransactionResponse saveOrder(TransactionRequest request){
        String response="";
        Order order=request.getOrder();
        Payment payment = request.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());
        Payment paymentResponse = restTemplate.postForObject("http://PAYMENT-SERVICE/payment/doPayment",payment,Payment.class);
        response=paymentResponse.getPaymentStatus().equals("success")?"order placed success":"Order failed";
        repository.save(order);
        return new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionId(),response);
    }
}
