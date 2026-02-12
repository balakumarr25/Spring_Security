package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.enitity.userdata;

public interface UserDataRepository extends JpaRepository<userdata, Integer>{
	
	public userdata findByUsername(String username);
}
