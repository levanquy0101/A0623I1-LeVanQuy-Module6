package com.example.fashionshop.controllers;

import com.example.fashionshop.entity.User;
import com.example.fashionshop.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/{username}")
@CrossOrigin(origins = "*")
public class StoreManagerRestController {

    @Autowired
    private IUserService iUserService;
    @GetMapping("")
    @ResponseBody
    public User getUserById(@PathVariable String username) {
        User user = iUserService.findByUsername(username);
        System.out.println(user);
        return user;
    }

    @GetMapping("/manager")
    @ResponseBody
    public User getFunction(@PathVariable String username) {
        User userDTO = iUserService.findByUsername(username);
        System.out.println(userDTO);
        return userDTO;
    }
}
