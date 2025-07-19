package com.mahi.mockprep.Dto;

public class FeedbackDto {

	    private Long id;
	    private String feedbackText;

	    public FeedbackDto() {}
	    public FeedbackDto(Long id, String feedbackText) {
	        this.id = id;
	        this.feedbackText = feedbackText;
	    }

	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }

	    public String getFeedbackText() { return feedbackText; }
	    public void setFeedbackText(String feedbackText) { this.feedbackText = feedbackText; }
	}



