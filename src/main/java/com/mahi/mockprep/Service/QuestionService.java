package com.mahi.mockprep.Service;

import java.util.List;

import com.mahi.mockprep.model.Question;

public interface QuestionService {
	List<Question> getQuestionByTopic(String topic);
	Question addQuestion (Question question);

}
