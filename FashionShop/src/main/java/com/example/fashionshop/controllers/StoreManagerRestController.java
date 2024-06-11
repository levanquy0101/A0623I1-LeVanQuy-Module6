package com.example.fashionshop.controllers;

import com.example.fashionshop.entity.User;
import com.example.fashionshop.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class StoreManagerRestController {

    @Autowired
    private IUserService iUserService;

//    // Endpoint để lấy tất cả người dùng
//    @GetMapping("/manager")
//    public List<User> getAllUsers() {
//        return iUserService.findAll();
//    }

    // Endpoint để lấy thông tin một người dùng theo ID
    @GetMapping("manager/{id}")
    @ResponseBody
    public User getUserById(@PathVariable Long id) {
        User user = iUserService.findById(id);
        System.out.println(user);
        return user;
    }

    @GetMapping("manager/{id}")
    @ResponseBody
    public User getFunction(@PathVariable Long id) {
        User user = iUserService.findById(id);
        System.out.println(user);
        return user;
    }
}
