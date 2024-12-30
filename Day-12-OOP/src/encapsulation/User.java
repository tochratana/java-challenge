package encapsulation;
import lombok.Data;
import java.util.*;
@Data
public class User {
    private Integer id;
    private UUID uuid;
    private String name;
    private String email;
    private String password;
    private Boolean isDeleted;


    public static void main(String[] args) {
        System.out.println("Hello World");


    }
}
