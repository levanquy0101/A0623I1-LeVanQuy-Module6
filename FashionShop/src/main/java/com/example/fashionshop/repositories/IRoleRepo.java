package com.example.fashionshop.repositories;

import com.example.fashionshop.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRoleRepo extends JpaRepository<Role, Long> {
//    boolean existByName(String name);
    Role findByName(String name);
}
