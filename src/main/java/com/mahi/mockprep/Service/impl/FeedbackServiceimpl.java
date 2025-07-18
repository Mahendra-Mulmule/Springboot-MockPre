package com.mahi.mockprep.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahi.mockprep.Repository.FeedbackRepository;
import com.mahi.mockprep.Service.FeedbackService;
import com.mahi.mockprep.model.Feedback;

@Service
public class FeedbackServiceimpl implements FeedbackService{
	
	    @Autowired
	    private FeedbackRepository feedbackRepository;

	    @Override
	    public List<Feedback> getAllFeedback() {
	        return feedbackRepository.findAll();
	    }

	    @Override
	    public Optional<Feedback> getFeedbackById(Long id) {
	        return feedbackRepository.findById(id);
	    }

}

