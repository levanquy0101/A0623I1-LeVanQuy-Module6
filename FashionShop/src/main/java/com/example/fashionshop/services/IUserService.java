package com.example.fashionshop.services;

import com.example.fashionshop.entity.User;

public interface IUserService {
    boolean existsByUsername(String admin);

    void save(User admin);

    User findById(Long id);
}
