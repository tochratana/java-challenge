package com.foodpanda.controler;

import com.foodpanda.model.Order;
import com.foodpanda.model.Product;
import com.foodpanda.service.AuthenticationService;
import com.foodpanda.service.CartService;
import com.foodpanda.service.OrderService;
import com.foodpanda.service.ProductService;
import com.foodpanda.view.View;

public class Controller {
    private AuthenticationService authService;
    private ProductService productService;
    private CartService cartService;
    private OrderService orderService;
    private View view;

    public Controller() {
        authService = new AuthenticationService();
        productService = new ProductService();
        cartService = new CartService();
        orderService = new OrderService();
        view = new View();
    }

    public void start() {
        if (login()) {
            mainMenu();
        } else {
            System.out.println("Login failed. Exiting...");
        }
    }

    private boolean login() {
        String username = view.getUsername();
        String password = view.getPassword();
        return authService.login(username, password);
    }

    private void mainMenu() {
        while (true) {
            int choice = view.getMenuChoice();
            switch (choice) {
                case 1:
                    addProductToCart();
                    break;
                case 2:
                    removeProductFromCart();
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    startOrder();
                    return;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addProductToCart() {
        view.showProducts(productService.getAllProducts());
        int productId = view.getProductId();
        int quantity = view.getQuantity();
        Product product = productService.getProductById(productId);
        if (product != null) {
            cartService.addProductToCart(product, quantity);
        } else {
            System.out.println("Product not found.");
        }
    }

    private void removeProductFromCart() {
        view.showCart(cartService.getCart());
        int productId = view.getProductId();
        Product product = productService.getProductById(productId);
        if (product != null) {
            cartService.removeProductFromCart(product);
        } else {
            System.out.println("Product not found.");
        }
    }

    private void viewCart() {
        view.showCart(cartService.getCart());
    }

    private void startOrder() {
        java.awt.Toolkit.getDefaultToolkit().beep(); // Alert sound
        Order order = orderService.createOrder(authService.getCurrentUser(), cartService.getCart());
        view.showOrder(order);
    }
}
