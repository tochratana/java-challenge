package com.foodpanda.model;

public class OrderDetail {
    private Product product;
    private int quantity;
    private double price;

    public OrderDetail(Product product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}