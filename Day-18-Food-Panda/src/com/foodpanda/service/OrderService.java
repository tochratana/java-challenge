package com.foodpanda.service;

import com.foodpanda.model.Cart;
import com.foodpanda.model.Order;
import com.foodpanda.model.User;

import java.util.Date;

public class OrderService {
    private int orderIdCounter = 1;

    public Order createOrder(User user, Cart cart) {
        double totalPrice = cart.getItems().entrySet().stream()
                .mapToDouble(entry -> entry.getKey().getPrice() * entry.getValue())
                .sum();
        Order order = new Order(orderIdCounter++, user, cart.getItems(), totalPrice, new Date());
        cart.clear();
        return order;
    }
}
