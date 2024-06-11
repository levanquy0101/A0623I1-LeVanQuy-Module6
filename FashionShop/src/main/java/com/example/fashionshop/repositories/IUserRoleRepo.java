package com.example.fashionshop.repositories;

import com.example.fashionshop.entity.User;
import com.example.fashionshop.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRoleRepo extends JpaRepository<UserRole,Long> {
    List<UserRole> findAllByUser(User user);
}
