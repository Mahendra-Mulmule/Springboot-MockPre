package com.mahi.mockprep.Service.impl;

import com.mahi.mockprep.Repository.QuestionRepository;
import com.mahi.mockprep.Service.QuestionService;
import com.mahi.mockprep.model.Question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class Questionserviceimpl  implements QuestionService{
	
	 @Autowired
	    private QuestionRepository qs;

	 @Override
	    public List<Question> getQuestionByTopic(String topic) {
	        return qs.findByTopic(topic);
	    }

	    @Override
	    public Question addQuestion(Question question) {
	        return qs.save(question);
	    }

		
	}
	
	


