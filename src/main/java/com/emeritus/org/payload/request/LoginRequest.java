package com.emeritus.org.payload.request;

import javax.validation.constraints.Email;

public class LoginRequest {
    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isValid() {
      
        // Perform validation based on your requirements
        // For example, check if the fields are not empty or null
        return username != null && !username.isEmpty() &&
               password != null && !password.isEmpty();
    }
}