package com.foodpanda.service;

import com.foodpanda.model.User;

public class AuthenticationService {
    private User currentUser;

    public boolean login(String username, String password) {
        // Dummy authentication for demonstration
        if ("user".equals(username) && "password".equals(password)) {
            currentUser = new User(username, password);
            java.awt.Toolkit.getDefaultToolkit().beep(); // Alert sound
            return true;
        }
        return false;
    }

    public User getCurrentUser() {
        return currentUser;
    }
}
