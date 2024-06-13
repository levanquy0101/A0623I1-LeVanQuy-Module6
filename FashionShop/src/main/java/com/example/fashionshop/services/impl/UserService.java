package com.example.fashionshop.services.impl;

import com.example.fashionshop.dto.UserDTO;
import com.example.fashionshop.entities.User;
import com.example.fashionshop.repositories.IUserRepo;
import com.example.fashionshop.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepo iUserRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public boolean existsByUsername(String admin) {
        return iUserRepository.existsByUsername(admin);
    }

    @Override
    public User save(User user) {
        user.setPassword(passwordEncoder.encode("1234"));
        user.setEnabled(true);
        return iUserRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return iUserRepository.findById(id).orElse(null);
    }

    @Override
    public User findByUsername(String username) {
        return iUserRepository.findByUsername(username);
    }

    public UserDTO convertToDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getCode(),
                user.getName(),
                user.getGender(),
                user.getUsername(),
                user.isEnabled(),
                user.getRole(),
                user.getDate(),
                user.getAddress(),
                user.getEmail(),
                user.getPhone()

        );
    }
}
