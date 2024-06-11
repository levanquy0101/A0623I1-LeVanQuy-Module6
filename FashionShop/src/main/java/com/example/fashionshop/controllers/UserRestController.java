package com.example.fashionshop.controllers;
import com.example.fashionshop.entity.User;
import com.example.fashionshop.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*")
public class UserRestController {

    @Autowired
    private IUserService iUserService;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_MANAGER')")
    @PostMapping("/create")
    @ResponseBody
    public User createUser(@RequestBody User user) {
        return iUserService.save(user);
    }
}
