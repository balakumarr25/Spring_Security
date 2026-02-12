package com.example.demo.enitity;

import jakarta.persistence.*;

@Entity
@Table(name = "userdata")
public class userdata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String username;

    @Column
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private userDataEnum userEnum;

    public userdata() {}

    public userdata(Integer id, String username, String password, userDataEnum userEnum) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userEnum = userEnum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public userDataEnum getUserEnum() {
        return userEnum;
    }

    public void setUserEnum(userDataEnum userEnum) {
        this.userEnum = userEnum;
    }
}