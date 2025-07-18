package com.mahi.mockprep.Service;

import java.util.List;
import java.util.Optional;

import com.mahi.mockprep.model.Feedback;

public interface FeedbackService {



	    List<Feedback> getAllFeedback();
	    Optional<Feedback> getFeedbackById(Long id);
	}


