package $org.example;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManager {
    private List<User> users = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private NotificationBot bot;

    public UserManager(String botToken, String chatId) {
        this.bot = new NotificationBot(botToken, chatId);
    }

    public void createUser() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        User user = new User(name, email);
        users.add(user);

        System.out.println("User created successfully!");
        System.out.println("User UUID: " + user.getUuid());

        // Send notification to Telegram
        bot.sendNotification("New user created: " + user.getName());
    }

    // Other methods (searchUserByUuid, updateUserByUuid, deleteUserByUuid, etc.)
}