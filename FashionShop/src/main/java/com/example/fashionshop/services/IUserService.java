package com.example.fashionshop.services;

import com.example.fashionshop.dto.UserDTO;
import com.example.fashionshop.entity.User;

public interface IUserService {
    boolean existsByUsername(String admin);

    User save(User user);

    User findById(Long id);

    User findByUsername(String username);
}
