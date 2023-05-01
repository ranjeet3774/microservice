package com.ranjeecode.order.os.api.repository;

import com.ranjeecode.order.os.api.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
