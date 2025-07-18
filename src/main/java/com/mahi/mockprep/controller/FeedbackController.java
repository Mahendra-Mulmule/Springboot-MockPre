package com.mahi.mockprep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahi.mockprep.Repository.FeedbackRepository;
import com.mahi.mockprep.Service.FeedbackService;
import com.mahi.mockprep.model.Feedback;


	@RestController
	@RequestMapping("/api/feedback")
	public class FeedbackController {

	    @Autowired
	    private FeedbackService feedbackservice;

	    @GetMapping("/all")
	    public List<Feedback> getAllFeedback() {
	        return feedbackservice.getAllFeedback();
	    }

	    @GetMapping("/{id}")
	    public Feedback getFeedbackById(@PathVariable Long id) {
	        return feedbackservice.getFeedbackById(id).orElse(null);
	    }
	}




	    

	
