package com.ranjeecode.order.os.api.common;

import com.ranjeecode.order.os.api.entity.Order;
import com.ranjeecode.order.os.api.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransactionRequest {
    private Order order;
    private Payment payment;
}
