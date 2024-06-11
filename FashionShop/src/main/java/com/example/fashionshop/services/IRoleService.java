package com.example.fashionshop.services;

import com.example.fashionshop.entity.Role;

import java.util.Optional;

public interface IRoleService {
//    Optional<Role> existByName(String name);
    Role findByName(String name);

    void save(Role adminRole);
}
