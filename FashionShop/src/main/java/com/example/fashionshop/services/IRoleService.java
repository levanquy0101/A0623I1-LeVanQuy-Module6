package com.example.fashionshop.services;

import com.example.fashionshop.entities.Role;

public interface IRoleService {
//    Optional<Role> existByName(String name);
    Role findByName(String name);

    void save(Role adminRole);
}
