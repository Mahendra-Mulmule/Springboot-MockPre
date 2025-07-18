package com.mahi.mockprep.Service;

import java.util.Optional;

import com.mahi.mockprep.model.User;

public interface UserService {
	User register(User user);
	Optional<User> login(String email, String password);

}
