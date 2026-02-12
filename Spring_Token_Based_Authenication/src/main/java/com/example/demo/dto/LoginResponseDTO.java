package com.example.demo.dto;

public class LoginResponseDTO {

    private String message;
    private String role;

    public LoginResponseDTO(String message, String role) {
        this.message = message;
        this.role = role;
    }

    public String getMessage() {
        return message;
    }

    public String getRole() {
        return role;
    }
}