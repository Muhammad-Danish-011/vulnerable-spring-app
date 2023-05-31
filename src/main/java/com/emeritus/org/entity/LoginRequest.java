package com.emeritus.org.entity;

import javax.validation.constraints.NotEmpty;

public class LoginRequest {
    
    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    // Getters and setters
}
