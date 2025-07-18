package com.mahi.mockprep.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahi.mockprep.Service.AnswerService;
import com.mahi.mockprep.model.Answer;
import com.mahi.mockprep.model.Feedback;

@RestController
@RequestMapping("/api/answers")
public class AnswerController {

    @Autowired
private AnswerService as;

    @PostMapping("/submit")
    public Feedback submitAnswer(@RequestBody Answer answer) {
        return as.submitAnswer(answer);

    }

}
