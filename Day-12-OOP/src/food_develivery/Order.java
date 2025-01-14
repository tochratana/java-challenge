package food_develivery;

import java.util.ArrayList;
import java.util.List;

class Order {
    private int orderId;
    private List<MenuItem> items;
    private String status;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.status = "Pending";
    }

    public void addItem(MenuItem menuItem) {
        items.add(menuItem);
    }

    public void removeItem(MenuItem menuItem) {
        items.remove(menuItem);
    }

    public float calculateTotal() {
        float total = 0;
        for (MenuItem item : items) {
            total += item.price;
        }
        return total;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public String getOrderDetails() {
        StringBuilder details = new StringBuilder("Order ID: " + orderId + "\nStatus: " + status + "\nItems:\n");
        for (MenuItem item : items) {
            details.append(item.getDetails()).append("\n");
        }
        details.append(String.format("Total: $%.2f", calculateTotal()));
        return details.toString();
    }
}
