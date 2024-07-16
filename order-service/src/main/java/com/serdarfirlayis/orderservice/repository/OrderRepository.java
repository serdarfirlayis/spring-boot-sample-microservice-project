package com.serdarfirlayis.orderservice.repository;

import com.serdarfirlayis.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
