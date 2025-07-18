package com.mahi.mockprep.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahi.mockprep.Service.QuestionService;
import com.mahi.mockprep.model.Question;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {
	@Autowired
	private QuestionService qs;
	
	@GetMapping("/{topic}")
	public List<Question> getQuetionsByTopic (@PathVariable String topic){
		return qs.getQuestionByTopic(topic);
	}
	
	
	@PostMapping("/add")
	public Question addquestion(@RequestBody Question question) {
		return qs.addQuestion(question);
	}

}
