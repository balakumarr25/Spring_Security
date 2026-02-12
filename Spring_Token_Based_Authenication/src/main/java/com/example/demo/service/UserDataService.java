package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.dto.LoginResponseDTO;
import com.example.demo.enitity.userdata;
import com.example.demo.repository.UserDataRepository;

@Service
public class UserDataService {

    private final UserDataRepository userDataRepository;

    public UserDataService(UserDataRepository userDataRepository) {
        this.userDataRepository = userDataRepository;
    }

    public LoginResponseDTO login(String username, String password) {

        userdata user = userDataRepository.findByUsername(username);

        if (user == null) {
            return new LoginResponseDTO("Invalid user", null);
        }

        if (!user.getPassword().equals(password)) {
            return new LoginResponseDTO("User login credential is wrong", null);
        }

        if (user.getUserEnum() == null) {
            return new LoginResponseDTO("User role not assigned", null);
        }

        return new LoginResponseDTO("Login Success", user.getUserEnum().name());
    }
}