package com.mahi.mockprep.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahi.mockprep.model.Feedback;

public interface FeedbackRepository  extends JpaRepository<Feedback, Long>{
	
	
}
