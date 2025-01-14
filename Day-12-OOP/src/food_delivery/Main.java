package food_delivery;

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
        System.out.println("=".repeat(20) + " Menu View " + "-".repeat(20));
        for (MenuItem item : menu) {
            System.out.println("-".repeat(20));
            System.out.println(item.getDetails());

        }
    }

    public void processOrder(Order order) {
        order.updateStatus("Preparing");
        orders.add(order);
        System.out.println("-".repeat(20) + " Processing order" + "-".repeat(20));
        System.out.println("Processing Order ID: " + order.getOrderDetails());
    }
}

// Main Method for Testing
public class Main {
    public static void main(String[] args) {
        // Create a restaurant
        Restaurant restaurant = new Restaurant();

        // Add menu items
        List<String> ingredients = new ArrayList<>();
        ingredients.add("Tomato");
        ingredients.add("Cheese");
        ingredients.add("Basil");
        restaurant.addToMenu(new FoodItem("Margherita Pizza", 12.99f, "Classic Italian Pizza", ingredients));
        restaurant.addToMenu(new DrinkItem("Coca Cola", 1.99f, "Chilled soft drink", "Medium"));

        // View menu

        restaurant.viewMenu();

        // Create user
        User user = new User(1, "Toch Ratana");

        // Create order
        Order order = new Order(1001);
        order.addItem(new FoodItem("Margherita Pizza", 12.99f, "Classic Italian Pizza", ingredients));
        order.addItem(new DrinkItem("Coca Cola", 1.99f, "Chilled soft drink", "Medium"));

        // Place order
        user.placeOrder(order);
        restaurant.processOrder(order);
        System.out.println("-".repeat(20) + " View History " + "-".repeat(20));

        // View order history
        user.viewOrderHistory();
    }
}

