package com.mahi.mockprep.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahi.mockprep.Dto.UserDto;
import com.mahi.mockprep.Service.UserService;
import com.mahi.mockprep.model.User;

@RestController
@RequestMapping("/api/users")

public class UserController {
	
	@Autowired
	private UserService userservice;
	
	
	@PostMapping("/register")
	public UserDto register(@RequestBody UserDto userdto) {
		
		User user=new User();
		user.setName(userdto.getName());
		user.setEmail(userdto.getEmail());
		user.setPassword(userdto.getPassword());
		
	User saveuser =userservice.register(user);
	
	//convert save entity into dto 
	 return new UserDto(saveuser.getId(), saveuser.getName(), saveuser.getEmail(), saveuser.getPassword());
    }
	
	 @PostMapping("/login")
	    public UserDto login(@RequestBody UserDto loginData) {
	        Optional<User> userOpt = userservice.login(loginData.getEmail(), loginData.getPassword());

	        if (userOpt.isPresent()) {
	            User u = userOpt.get();
	            return new UserDto(u.getId(), u.getName(), u.getEmail(), u.getPassword());
	        }
	        return null;	
	}

}
