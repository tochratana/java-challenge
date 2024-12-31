package encapsulation;
import lombok.Data;
import java.util.*;
// Encapsulation uses for hide data and makes it more sources.
@Data  // We use it to reduce writing getter and setter, this library calls lombok
public class User {
    private Integer id;
    private UUID uuid;
    private String name;
    private String email;
    private String password;
    private Boolean isDeleted; // all data members always private

    private void display(){
        System.out.println("id: " + id + " name: " + name + " email: " + email + " password: " + password);
    }


    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setUuid(UUID.randomUUID());
        user.setName("test");
        user.setEmail("test@test.com");
        user.setPassword("test");

        user.display();



    }
}
