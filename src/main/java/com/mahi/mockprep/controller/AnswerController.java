package com.mahi.mockprep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mahi.mockprep.Repository.QuestionRepository;
import com.mahi.mockprep.Repository.UserRepository;
import com.mahi.mockprep.Repository.AnswerRepository;
import com.mahi.mockprep.Repository.FeedbackRepository;
import com.mahi.mockprep.Dto.AnswerDto;
import com.mahi.mockprep.Dto.FeedbackDto;
import com.mahi.mockprep.model.Answer;
import com.mahi.mockprep.model.Feedback;
import com.mahi.mockprep.model.Question;
import com.mahi.mockprep.model.User;

@RestController
@RequestMapping("/api/answers")
public class AnswerController {

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private FeedbackRepository feedbackRepository;

    @PostMapping("/submit")
    public FeedbackDto submitAnswer(@RequestBody AnswerDto answerDto) {

        // ✅ Extract user and question IDs from DTO
        Long userId = answerDto.getUserId();         // ✅ Fixed here
        Long questionId = answerDto.getQuestionId();

        // ✅ Load full entities from database
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        Question question = questionRepository.findById(questionId)
                .orElseThrow(() -> new RuntimeException("Question not found"));

        // ✅ Create Answer entity
        Answer answer = new Answer();
        answer.setUser(user);
        answer.setQuestion(question);
        answer.setAnswerText(answerDto.getAnswerText());

        // ✅ Save Answer
        Answer savedAnswer = answerRepository.save(answer);

        // ✅ Generate and Save Feedback
        Feedback feedback = new Feedback();
        feedback.setAnswer(savedAnswer);
        feedback.setFeedbackText("Good attempt! Add more explanation.");
        feedback = feedbackRepository.save(feedback);  // ✅ Save feedback

        // ✅ Return DTO
        return new FeedbackDto(feedback.getId(), feedback.getFeedbackText());
    }
}
