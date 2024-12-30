// Class representing a Customer
class Customer {
    private String name;
    private Order order; // Association with Order

    // Constructor
    public Customer(String name) {
        this.name = name;
    }

    // Method to place an order
    public void placeOrder(Order order) {
        this.order = order;
        System.out.println(name + " placed an order for " + order.getItemName());
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public Order getOrder() {
        return order;
    }
}

// Class representing an Order
class Order {
    private String itemName;

    // Constructor
    public Order(String itemName) {
        this.itemName = itemName;
    }

    // Getter
    public String getItemName() {
        return itemName;
    }
}

// Main class to demonstrate association
public class Association {
    public static void main(String[] args) {
        // Create a Customer
        Customer customer = new Customer("Toch Ratana");

        // Create an Order
        Order order = new Order("Laptop");

        // Establish the association
        customer.placeOrder(order);

        // Access associated objects
        System.out.println(customer.getName() + "'s order is for: " + customer.getOrder().getItemName());
    }
}
