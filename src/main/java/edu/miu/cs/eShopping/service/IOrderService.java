package edu.miu.cs.eShopping.service;

import edu.miu.cs.eShopping.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IOrderService {
    List<Order> getOrders();
    Order saveOrder(Order order);
    Optional<Order> findOrderById(long orderId);
    void deleteOrder(Order order);
}
