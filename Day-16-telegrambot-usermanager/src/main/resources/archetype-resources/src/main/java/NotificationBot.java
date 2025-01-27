package $org.example;

/**
 * Hello world!
 *
 */
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class NotificationBot extends TelegramLongPollingBot {
    private String botToken;
    private String chatId;

    public NotificationBot(String botToken, String chatId) {
        this.botToken = botToken;
        this.chatId = chatId;
    }

    @Override
    public void onUpdateReceived(Update update) {
        // Handle incoming messages (optional)
    }

    @Override
    public String getBotUsername() {
        return "tochratana_bot"; // Replace with your bot's username
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    public void sendNotification(String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
