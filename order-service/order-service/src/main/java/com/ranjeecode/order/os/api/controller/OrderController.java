package com.ranjeecode.order.os.api.controller;

import com.ranjeecode.order.os.api.common.Payment;
import com.ranjeecode.order.os.api.common.TransactionRequest;
import com.ranjeecode.order.os.api.common.TransactionResponse;
import com.ranjeecode.order.os.api.entity.Order;
import com.ranjeecode.order.os.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
        return service.saveOrder(request);
    }
}
