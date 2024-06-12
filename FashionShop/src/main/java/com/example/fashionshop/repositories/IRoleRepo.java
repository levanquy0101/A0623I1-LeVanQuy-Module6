package com.example.fashionshop.repositories;

import com.example.fashionshop.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IRoleRepo extends JpaRepository<Role, Long> {
//    boolean existByName(String name);
    Role findByName(String name);
}
