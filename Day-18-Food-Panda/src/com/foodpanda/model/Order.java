package com.foodpanda.model;

import java.util.Date;
import java.util.Map;

public class Order {
    private int orderId;
    private User user;
    private Map<Product, Integer> items;
    private double totalPrice;
    private Date orderDate;

    public Order(int orderId, User user, Map<Product, Integer> items, double totalPrice, Date orderDate) {
        this.orderId = orderId;
        this.user = user;
        this.items = items;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public User getUser() {
        return user;
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }
}
