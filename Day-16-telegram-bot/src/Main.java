import java.util.UUID;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class User {
    private static int nextId = 1; // Auto-generate id
    private int id;
    private String uuid;
    private String name;
    private String email;
    private boolean isDeleted;

    public User(String name, String email) {
        this.id = nextId++;
        this.uuid = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.isDeleted = false;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return String.format("| %-4d | %-36s | %-20s | %-20s | %-8s |",
                id, uuid, name, email, isDeleted);
    }
}



class UserManager {
    private List<User> users = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Create a new user
    public void createUser() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        User user = new User(name, email);
        users.add(user);

        System.out.println("User created successfully!");
        System.out.println("User UUID: " + user.getUuid());

        // Send notification to Telegram (placeholder)
        sendTelegramNotification("New user created: " + user.getName());
    }

    // Search user by UUID
    public void searchUserByUuid() {
        System.out.print("Enter UUID: ");
        String uuid = scanner.nextLine();

        User user = findUserByUuid(uuid);
        if (user != null) {
            System.out.println("User found:");
            System.out.println(user);
        } else {
            System.out.println("User not found.");
        }
    }

    // Update user by UUID
    public void updateUserByUuid() {
        System.out.print("Enter UUID: ");
        String uuid = scanner.nextLine();

        User user = findUserByUuid(uuid);
        if (user != null) {
            System.out.print("Enter new name: ");
            user.setName(scanner.nextLine());
            System.out.print("Enter new email: ");
            user.setEmail(scanner.nextLine());
            System.out.print("Set isDeleted (true/false): ");
            user.setDeleted(Boolean.parseBoolean(scanner.nextLine()));

            System.out.println("User updated successfully!");
        } else {
            System.out.println("User not found.");
        }
    }

    // Delete user by UUID
    public void deleteUserByUuid() {
        System.out.print("Enter UUID: ");
        String uuid = scanner.nextLine();

        User user = findUserByUuid(uuid);
        if (user != null) {
            user.setDeleted(true);
            System.out.println("User deleted successfully!");
        } else {
            System.out.println("User not found.");
        }
    }

    // Display all users (paginated)
    public void displayAllUsers() {
        System.out.print("Enter page number: ");
        int page = Integer.parseInt(scanner.nextLine());

        List<User> activeUsers = users.stream()
                .filter(user -> !user.isDeleted())
                .toList();

        int start = (page - 1) * 5;
        int end = Math.min(start + 5, activeUsers.size());

        if (start >= activeUsers.size()) {
            System.out.println("No users found for this page.");
            return;
        }

        System.out.println("+------+--------------------------------------+----------------------+----------------------+----------+");
        System.out.println("| ID   | UUID                                 | Name                 | Email                | Deleted  |");
        System.out.println("+------+--------------------------------------+----------------------+----------------------+----------+");
        for (int i = start; i < end; i++) {
            System.out.println(activeUsers.get(i));
        }
        System.out.println("+------+--------------------------------------+----------------------+----------------------+----------+");
    }

    // Helper method to find user by UUID
    private User findUserByUuid(String uuid) {
        return users.stream()
                .filter(user -> user.getUuid().equals(uuid))
                .findFirst()
                .orElse(null);
    }

    // Placeholder for Telegram notification
    private void sendTelegramNotification(String message) {
        System.out.println("[Telegram Notification] " + message);
    }
}


public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nUser Management System");
            System.out.println("1. Create User");
            System.out.println("2. Search User by UUID");
            System.out.println("3. Update User by UUID");
            System.out.println("4. Delete User by UUID");
            System.out.println("5. Display All Users");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    userManager.createUser();
                    break;
                case 2:
                    userManager.searchUserByUuid();
                    break;
                case 3:
                    userManager.updateUserByUuid();
                    break;
                case 4:
                    userManager.deleteUserByUuid();
                    break;
                case 5:
                    userManager.displayAllUsers();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
