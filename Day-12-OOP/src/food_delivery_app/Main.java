package food_delivery_app;

import food_delivery_app.modal.*;

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
        System.out.println("=".repeat(20)+" Menu " + "=".repeat(20));
        for (MenuItem item : menu) {
            item.getDetails();
            System.out.println("------------------------");
        }
        System.out.println("=".repeat(20)+" End Menu " + "=".repeat(20));
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
        restaurant.addToMenu(new FoodItem("Burger", 9.99f, "Beef burger with lettuce and tomato", List.of("Beef", "Lettuce", "Tomato", "Bun")));
        restaurant.addToMenu(new FoodItem("Pasta", 10.49f, "Creamy Alfredo pasta with chicken", List.of("Chicken", "Pasta", "Cream", "Parmesan")));
        restaurant.addToMenu(new FoodItem("Sushi", 15.99f, "Salmon sushi rolls with avocado", List.of("Salmon", "Rice", "Seaweed", "Avocado")));
        restaurant.addToMenu(new FoodItem("Salad", 8.99f, "Fresh garden salad with vinaigrette", List.of("Lettuce", "Tomato", "Cucumber", "Vinaigrette")));
        restaurant.addToMenu(new FoodItem("Taco", 7.99f, "Spicy beef taco with salsa", List.of("Beef", "Taco Shell", "Salsa", "Cheese")));

        restaurant.addToMenu(new DrinkItem("Coke", 1.99f, "Chilled soft drink", "Medium"));
        restaurant.addToMenu(new DrinkItem("Pepsi", 1.89f, "Refreshing cola drink", "Medium"));
        restaurant.addToMenu(new DrinkItem("Lemonade", 2.49f, "Freshly squeezed lemonade", "Large"));
        restaurant.addToMenu(new DrinkItem("Iced Coffee", 3.99f, "Chilled coffee with milk and ice", "Large"));
        restaurant.addToMenu(new DrinkItem("Orange Juice", 2.99f, "Freshly squeezed orange juice", "Small"));
        restaurant.addToMenu(new DrinkItem("Green Tea", 2.29f, "Hot green tea with a hint of jasmine", "Medium"));


        // Create user ==============
        User tochratana = new User(1, "Toch Ratana");
        User teacher = new User(2, "KOKO");

        // Controller ==============
        // User : tochratana
        FoodDeliveryController controllerUser_tochratana = new FoodDeliveryController(restaurant, tochratana);
        // User : teacher
        FoodDeliveryController controllerUser_teacher = new FoodDeliveryController(restaurant, teacher);

        // View Menu User : tochratana
        controllerUser_tochratana.showMenu();

        // View Menu User : teacher
        controllerUser_teacher.showMenu();

        // Place Order User : tochratana
        Order order = new Order(1001);
        order.addItem(new FoodItem("Pizza", 12.99f, "Cheese and tomato pizza", List.of("Cheese", "Tomato", "Dough")));
        order.addItem(new DrinkItem("Coke", 1.99f, "Chilled soft drink", "Medium"));
        controllerUser_tochratana.placeOrder(order);



        // Place Order User : teacher
        Order order2 = new Order(1002);
        order2.addItem(new FoodItem("Salad", 8.99f, "Fresh garden salad with vinaigrette", List.of("Lettuce", "Tomato", "Cucumber", "Vinaigrette")));
        order2.addItem(new DrinkItem("Green Tea", 2.29f, "Hot green tea with a hint of jasmine", "Medium"));
        controllerUser_teacher.placeOrder(order2);

        // Show Order History User : tochratana
        controllerUser_tochratana.showOrderHistory();

        // Show Order History User : teacher
        controllerUser_teacher.showOrderHistory();
    }
}

