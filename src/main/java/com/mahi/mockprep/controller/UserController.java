package com.mahi.mockprep.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahi.mockprep.Service.UserService;
import com.mahi.mockprep.model.User;

@RestController
@RequestMapping("/api/users")

public class UserController {
	
	@Autowired
	private UserService userservice;
	
	
	@PostMapping("/register")
	public User register(@RequestBody User user ) {
		return userservice.register(user);
	}
	
	@PostMapping("/login")
	public Optional<User>login(@RequestBody User loginData){
		return userservice.login(loginData.getEmail(),loginData.getPassword());
				
	}

}
