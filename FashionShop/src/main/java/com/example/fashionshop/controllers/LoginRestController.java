//package com.example.fashionshop.controllers;
//
//import com.example.fashionshop.dto.LoginFormDTO;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//public class LoginRestController {
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @PostMapping("/api/login")
//    public ResponseEntity<String> login(@RequestBody LoginFormDTO loginForm, HttpServletResponse response) {
//        try {
//            // Authenticate user
//            Authentication authentication = authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(loginForm.getUsername(), loginForm.getPassword()));
//
//            // Generate JWT token (implement this logic securely)
//
//            // Set JWT token in response header
//
//            // Return success response
//            return ResponseEntity.ok("Login successful");
//        } catch (BadCredentialsException | UsernameNotFoundException e) {
//            // Return unauthorized response for invalid credentials
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
//        }
//    }
//}
