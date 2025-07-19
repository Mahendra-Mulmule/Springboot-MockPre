package com.mahi.mockprep.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mahi.mockprep.Dto.QuestionDto;
import com.mahi.mockprep.Service.QuestionService;
import com.mahi.mockprep.model.Question;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/{topic}")
    public List<QuestionDto> getQuestionsByTopic(@PathVariable String topic) {
        return questionService.getQuestionByTopic(topic).stream()
                .map(q -> new QuestionDto(q.getId(), q.getTopic(), q.getQuestiontext()))
                .collect(Collectors.toList());
    }

    @PostMapping("/add")
    public QuestionDto addQuestion(@RequestBody QuestionDto questionDto) {
        Question q = new Question();
        q.setTopic(questionDto.getTopic());
        q.setQuestiontext(questionDto.getQuestionText());
        Question saved = questionService.addQuestion(q);
        return new QuestionDto(saved.getId(), saved.getTopic(), saved.getQuestiontext());
    }
}
