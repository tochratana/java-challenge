package food_develivery_app;

import food_develivery_app.modal.*;

import java.util.ArrayList;
import java.util.List;


// Class: Restaurant
class Restaurant {
    private List<MenuItem> menu;
    private List<Order> orders;

    public Restaurant() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addToMenu(MenuItem item) {
        menu.add(item);
    }

    public void viewMenu() {
        System.out.println("Menu:");
        for (MenuItem item : menu) {
            item.getDetails();
            System.out.println("------------------------");
        }
    }

    public void processOrder(Order order) {
        order.updateStatus("Preparing");
        orders.add(order);
    }
}

// Controller Class
class FoodDeliveryController {
    private Restaurant restaurant;
    private User user;

    public FoodDeliveryController(Restaurant restaurant, User user) {
        this.restaurant = restaurant;
        this.user = user;
    }

    public void placeOrder(Order order) {
        user.placeOrder(order);
        restaurant.processOrder(order);
        System.out.println("Order placed successfully!");
    }

    public void showMenu() {
        restaurant.viewMenu();
    }

    public void showOrderHistory() {
        user.viewOrderHistory();
    }
}

// Main Application (View Layer)
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // Add menu items
        restaurant.addToMenu(new FoodItem("Pizza", 12.99f, "Cheese and tomato pizza", List.of("Cheese", "Tomato", "Dough")));
        restaurant.addToMenu(new DrinkItem("Coke", 1.99f, "Chilled soft drink", "Medium"));

        // Create user
        User user = new User(1, "John Doe");

        // Controller
        FoodDeliveryController controller = new FoodDeliveryController(restaurant, user);

        // View Menu
        controller.showMenu();

        // Place Order
        Order order = new Order(1001);
        order.addItem(new FoodItem("Pizza", 12.99f, "Cheese and tomato pizza", List.of("Cheese", "Tomato", "Dough")));
        order.addItem(new DrinkItem("Coke", 1.99f, "Chilled soft drink", "Medium"));
        controller.placeOrder(order);

        // Show Order History
        controller.showOrderHistory();
    }
}

