
import lombok.Data;
import lombok.ToString;

import java.util.*;
@Data
public class User {
    private Integer id;
    private UUID uuid;
    private String name;
    private String email;
    private String password;
    private Boolean isDeleted;
    private Date createTime;

    void display(){
        System.out.println("id: " + id + " name: " + name + " email: " + email + " password: " + password + " " +
                "isDeleted: " + isDeleted + " createTime: " + createTime);
    }


    public static void main(String[] args) {

        User user = new User();
        user.setId(12);
        user.setUuid(UUID.randomUUID());
        user.setName("Ratana");
        user.setIsDeleted(false);
        user.setPassword("1234");
        user.setEmail("ratana@gamil.com");
        user.setCreateTime(new Date());
        System.out.println(user);
        user.display();
    }
}