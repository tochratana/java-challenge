package food_develivery_app.modal;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String name;
    private List<Order> orderHistory;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.orderHistory = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orderHistory.add(order);
    }

    public void viewOrderHistory() {
        System.out.println("Order History for User: " + name);
        for (Order order : orderHistory) {
            order.displayOrderDetails();
            System.out.println("------------------------");
        }
    }
}
