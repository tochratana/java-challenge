package com.foodpanda.service;

import com.foodpanda.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products;

    public ProductService() {
        products = new ArrayList<>();
        // Dummy data for demonstration
        products.add(new Product(1, "Burger", 5.99));
        products.add(new Product(2, "Pizza", 8.99));
        products.add(new Product(3, "Pasta", 7.99));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
