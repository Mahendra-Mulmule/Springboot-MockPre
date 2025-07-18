package com.mahi.mockprep.Service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahi.mockprep.Repository.UserRepository;
import com.mahi.mockprep.Service.UserService;
import com.mahi.mockprep.model.User;
@Service
public class Userserviceimpl  implements UserService{
	
	@Autowired
	 private UserRepository userrepository;
	
	
	 @Override
	    public User register(User user) {
	        return userrepository.save(user);
	    }

	    @Override
	    public Optional<User> login(String email, String password) {
	        return userrepository.findByEmail(email)
	                .filter(user -> user.getPassword().equals(password));
	    }
	}
	
	


