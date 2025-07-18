package com.mahi.mockprep.Service;

import com.mahi.mockprep.model.Answer;
import com.mahi.mockprep.model.Feedback;

public interface AnswerService {
	
	Feedback submitAnswer(Answer answer);

}
