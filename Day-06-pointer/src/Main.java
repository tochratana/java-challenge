import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Gun gun1 = new Gun();
        gun1.id = new Random().nextInt(100);
        gun1.model = "Dragon";
        gun1.uuid = UUID.randomUUID();
        gun1.releaseDate = LocalDateTime.of(1999, 1, 1, 0, 0);
        gun1.display();

    }
}
