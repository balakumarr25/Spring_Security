package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.LoginRequestDTO;
import com.example.demo.dto.LoginResponseDTO;
import com.example.demo.service.UserDataService;

@RestController
@RequestMapping("/user")
public class UserDataController {

    private final UserDataService userDataService;

    public UserDataController(UserDataService userDataService) {
        this.userDataService = userDataService;
    }

    @PostMapping("/login")
    public LoginResponseDTO login(@RequestBody LoginRequestDTO dto) {
        return userDataService.login(dto.getUsername(), dto.getPassword());
    }
}