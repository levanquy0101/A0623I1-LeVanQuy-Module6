package com.example.fashionshop.controllers;
import com.example.fashionshop.dto.UserDTO;
import com.example.fashionshop.entities.Customer;
import com.example.fashionshop.entities.User;
import com.example.fashionshop.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/{username}")
@CrossOrigin(origins = "*")
public class UserRestController {

    @Autowired
    private IUserService iUserService;


    @GetMapping("")
    @ResponseBody
    public UserDTO getUserById(@PathVariable String username) {
        User user = iUserService.findByUsername(username);
        System.out.println(iUserService.convertToDTO(user));
        return iUserService.convertToDTO(user);
    }

//    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_MANAGER')")
    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = iUserService.save(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
}
