package com.mahi.mockprep.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahi.mockprep.Repository.AnswerRepository;
import com.mahi.mockprep.Repository.FeedbackRepository;
import com.mahi.mockprep.Service.AnswerService;
import com.mahi.mockprep.model.Answer;
import com.mahi.mockprep.model.Feedback;

@Service
public class Answerserviceimpl implements AnswerService{
	
	 @Autowired
	    private AnswerRepository answerRepository;

	    @Autowired
	    private FeedbackRepository feedbackRepository;

	    @Override
	    public Feedback submitAnswer(Answer answer) {
	        Answer savedAnswer = answerRepository.save(answer);

	        // Later: Replace this with actual AI logic
	        String feedbackText = "Good attempt! Add more explanation.";

	        Feedback feedback = new Feedback();
	        feedback.setAnswer(savedAnswer);
	        feedback.setFeedbackText(feedbackText);

	        return feedbackRepository.save(feedback);
	    }
	}
	
	


