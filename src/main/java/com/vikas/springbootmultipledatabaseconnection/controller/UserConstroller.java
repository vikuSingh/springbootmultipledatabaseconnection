package com.vikas.springbootmultipledatabaseconnection.controller;

import com.vikas.springbootmultipledatabaseconnection.dto.UserRequestDto;
import com.vikas.springbootmultipledatabaseconnection.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserConstroller {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(userService.findAllUsers());
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveUser(@RequestBody UserRequestDto userRequestDto) {
        return ResponseEntity.ok(userService.saveUser(userRequestDto));
    }
}
