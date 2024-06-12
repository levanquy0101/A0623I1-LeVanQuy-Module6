package com.example.fashionshop.services.impl;

import com.example.fashionshop.dto.UserInforUserDetails;
import com.example.fashionshop.entities.User;
import com.example.fashionshop.entities.UserRole;
import com.example.fashionshop.repositories.IUserRepo;
import com.example.fashionshop.repositories.IUserRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInforDetailService implements UserDetailsService {
    @Autowired
    private IUserRepo iUserRepository;

    @Autowired
    private IUserRoleRepo iUserRoleRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User appUser = iUserRepository.findByUsername(username);
        List<UserRole> userRoles = iUserRoleRepository.findAllByUser(appUser);
        UserInforUserDetails infoUserDetails = new UserInforUserDetails(appUser, userRoles);
        return infoUserDetails;
    }
}
