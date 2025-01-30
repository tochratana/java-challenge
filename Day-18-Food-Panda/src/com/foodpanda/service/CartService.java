package com.foodpanda.service;

import com.foodpanda.model.Cart;
import com.foodpanda.model.Product;

public class CartService {
    private Cart cart;

    public CartService() {
        cart = new Cart();
    }

    public void addProductToCart(Product product, int quantity) {
        cart.addProduct(product, quantity);
    }

    public void removeProductFromCart(Product product) {
        cart.removeProduct(product);
    }

    public Cart getCart() {
        return cart;
    }

    public void clearCart() {
        cart.clear();
    }
}
