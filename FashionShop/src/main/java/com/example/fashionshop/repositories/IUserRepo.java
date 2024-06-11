package com.example.fashionshop.repositories;

import com.example.fashionshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
    boolean existsByUsername(String admin);
}
