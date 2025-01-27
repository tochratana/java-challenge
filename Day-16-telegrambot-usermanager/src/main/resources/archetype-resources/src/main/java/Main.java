package $org.example;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String botToken = "7744343959:AAG02Rn_ST68G7jngTn80KuONz5r0R"; // Your bot token
        String chatId = "YOUR_CHAT_ID"; // Replace with your Chat ID

        UserManager userManager = new UserManager(botToken, chatId);
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