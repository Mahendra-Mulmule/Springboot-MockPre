package com.mahi.mockprep.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahi.mockprep.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User>findByEmail(String email);

}
