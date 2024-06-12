package com.example.fashionshop.repositories;

import com.example.fashionshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
    boolean existsByUsername(String admin);
}
