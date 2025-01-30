package com.foodpanda.view;

import com.foodpanda.model.Cart;
import com.foodpanda.model.Order;
import com.foodpanda.model.Product;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public void showProducts(List<Product> products) {
        System.out.println("ID\tName\tPrice");
        for (Product product : products) {
            System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
        }
    }

    public void showCart(Cart cart) {
        System.out.println("Your Cart:");
        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            System.out.println(entry.getKey().getName() + "\t" + entry.getValue() + "\t" + entry.getKey().getPrice() * entry.getValue());
        }
    }

    public void showOrder(Order order) {
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Order Date: " + order.getOrderDate());
        System.out.println("Total Price: " + order.getTotalPrice());
        System.out.println("Items:");
        for (Map.Entry<Product, Integer> entry : order.getItems().entrySet()) {
            System.out.println(entry.getKey().getName() + "\t" + entry.getValue() + "\t" + entry.getKey().getPrice() * entry.getValue());
        }
    }

    public int getProductId() {
        System.out.print("Enter Product ID: ");
        return scanner.nextInt();
    }

    public int getQuantity() {
        System.out.print("Enter Quantity: ");
        return scanner.nextInt();
    }

    public String getUsername() {
        System.out.print("Enter Username: ");
        return scanner.next();
    }

    public String getPassword() {
        System.out.print("Enter Password: ");
        return scanner.next();
    }

    public int getMenuChoice() {
        System.out.println("1. Add Product to Cart");
        System.out.println("2. Remove Product from Cart");
        System.out.println("3. View Cart");
        System.out.println("4. Start Order");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }
}
