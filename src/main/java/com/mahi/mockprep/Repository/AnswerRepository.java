package com.mahi.mockprep.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahi.mockprep.model.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
	

	
}
