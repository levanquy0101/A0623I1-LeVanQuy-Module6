package com.example.fashionshop.services.impl;

import com.example.fashionshop.entity.Role;
import com.example.fashionshop.repositories.IRoleRepo;
import com.example.fashionshop.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepo iRoleRepo;

//    @Override
//    public Optional<Role> existByName(String name) {
//        return iRoleRepo.existByName(name);
//    }

    @Override
    public Role findByName(String name) {
        return iRoleRepo.findByName(name);
    }

    @Override
    public void save(Role adminRole) {
        iRoleRepo.save(adminRole);
    }
}
