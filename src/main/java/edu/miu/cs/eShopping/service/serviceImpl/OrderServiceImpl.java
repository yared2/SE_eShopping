package edu.miu.cs.eShopping.service.serviceImpl;

import edu.miu.cs.eShopping.model.Order;
import edu.miu.cs.eShopping.service.IOrderService;

import java.util.List;
import java.util.Optional;

public class OrderServiceImpl implements IOrderService {
    @Override
    public List<Order> getOrders() {
        return null;
    }

    @Override
    public Order saveOrder(Order order) {
        return null;
    }

    @Override
    public Optional<Order> findOrderById(long orderId) {
        return Optional.empty();
    }

    @Override
    public void deleteOrder(Order order) {

    }
}
