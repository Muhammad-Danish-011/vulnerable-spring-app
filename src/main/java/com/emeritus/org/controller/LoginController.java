package com.emeritus.org.controller;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emeritus.org.payload.request.LoginRequest;

@RestController
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        if (loginRequest.isValid()) {
            // Perform login logic
            // Additional validation or authentication steps can be performed here
            // Return a response based on the login result
            return ResponseEntity.ok().build();
        } else {
            // Handle invalid request
            return ResponseEntity.badRequest().build();
        }
    }

    // Other controller methods and endpoints




    // @Autowired
    // private AuthenticationManager authenticationManager;

    // @PostMapping("/login")
    // public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
    //     try {
    //         authenticationManager.authenticate(
    //                 new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
    //         );
            
    //         // Authentication successful
    //         // Generate authentication token or session
    //         // Store session or token information
            
    //         logger.info("Successful login - User: {}", loginRequest.getUsername());
            
    //         return ResponseEntity.ok().build();
    //     } catch (AuthenticationException e) {
    //         // Authentication failed
    //         logger.warn("Failed login attempt - User: {}", loginRequest.getUsername());
            
    //         return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    //     }
    // }

    // Other controller methods and endpoints
}


