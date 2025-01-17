package user_manager.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManager {
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
