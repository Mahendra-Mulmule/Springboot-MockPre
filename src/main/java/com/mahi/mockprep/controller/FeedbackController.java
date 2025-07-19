package com.mahi.mockprep.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mahi.mockprep.Dto.FeedbackDto;
import com.mahi.mockprep.Service.FeedbackService;
import com.mahi.mockprep.model.Feedback;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackservice;

    @GetMapping("/all")
    public List<FeedbackDto> getAllFeedback() {
        return feedbackservice.getAllFeedback().stream()
                .map(f -> new FeedbackDto(f.getId(), f.getFeedbackText()))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public FeedbackDto getFeedbackById(@PathVariable Long id) {
        Feedback f = feedbackservice.getFeedbackById(id).orElse(null);
        if (f == null) return null;
        return new FeedbackDto(f.getId(), f.getFeedbackText());
    }
}
