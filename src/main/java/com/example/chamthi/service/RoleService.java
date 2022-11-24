package com.example.chamthi.service;

import com.example.chamthi.entity.Role;
import com.example.chamthi.enumcation.ERole;

import java.util.Optional;

public interface RoleService {
    Optional<Role> findByName(ERole name);
}
