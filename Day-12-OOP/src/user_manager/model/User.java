package user_manager.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Setter
@Getter
public class User {
    private static int nextId = 1; // Auto-generate id
    // Getters and Setters
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
