package model;

import org.nocrala.tools.texttablefmt.Table;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

class Users {
    private Integer id;
    private UUID uuid;
    private String userName;
    private String email;
    private String password;
    private Boolean isDeleted;
    private Boolean isVerified;
    private LocalDateTime createdDate;

    // Getter and Setter methods
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public UUID getUuid() { return uuid; }
    public void setUuid(UUID uuid) { this.uuid = uuid; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Boolean getIsDeleted() { return isDeleted; }
    public void setIsDeleted(Boolean isDeleted) { this.isDeleted = isDeleted; }

    public Boolean getIsVerified() { return isVerified; }
    public void setIsVerified(Boolean isVerified) { this.isVerified = isVerified; }

    public LocalDateTime getCreatedDate() { return createdDate; }
    public void setCreatedDate(LocalDateTime createdDate) { this.createdDate = createdDate; }

    public void displayInfo() {
        System.out.println("Your ID : " + id);
        System.out.println("Your UUID : " + uuid);
        System.out.println("User Name : " + userName);
        System.out.println("Email : " + email);
        System.out.println("Your Password : " + password);
        System.out.println("Deleted : " + isDeleted);
        System.out.println("Verified : " + isVerified);
        System.out.println("Created Date : " + createdDate);
    }
}

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Users users = new Users();

        // Input user details
        System.out.print("Input ID : ");
        users.setId(scanner.nextInt());
        scanner.nextLine(); // Consume newline

        users.setUuid(UUID.randomUUID());
        System.out.print("Input User Name : ");
        users.setUserName(scanner.nextLine());

        System.out.print("Input Email : ");
        users.setEmail(scanner.nextLine());

        System.out.print("Input Password : ");
        users.setPassword(scanner.nextLine());

        users.setIsDeleted(false);
        users.setIsVerified(true);
        users.setCreatedDate(LocalDateTime.now());

        System.out.println("-".repeat(30));
        users.displayInfo();

        // Display user data in a table
        Table table = new Table(4); // 4 columns
        table.addCell("ID");
        table.addCell("User Name");
        table.addCell("Is Deleted");
        table.addCell("Is Verified");

        table.addCell(users.getId().toString());
        table.addCell(users.getUserName());
        table.addCell(users.getIsDeleted().toString());
        table.addCell(users.getIsVerified().toString());

        System.out.println("\nUser Data Table:");
        System.out.println(table.render());
    }
}
