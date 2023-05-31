package com.emeritus.org.repository;

// Using Spring Data JPA

import org.springframework.data.jpa.repository.JpaRepository;

import com.emeritus.org.entity.User;

import antlr.collections.List;

public interface Userrepository extends JpaRepository<User, Long> {
    List<User> findByUsername(String username);
}
