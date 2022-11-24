package com.example.chamthi.service;

import com.example.chamthi.entity.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUserByUsername(String username);
}
