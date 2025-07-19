package com.mahi.mockprep.Dto;

public class AnswerDto {


	    private Long userId;
	    private Long questionId;
	    private String answerText;

	    public AnswerDto() {}
	    public AnswerDto(Long userId, Long questionId, String answerText) {
	        this.userId = userId;
	        this.questionId = questionId;
	        this.answerText = answerText;
	    }

	    public Long getUserId() { return userId; }
	    public void setUserId(Long userId) { this.userId = userId; }

	    public Long getQuestionId() { return questionId; }
	    public void setQuestionId(Long questionId) { this.questionId = questionId; }

	    public String getAnswerText() { return answerText; }
	    public void setAnswerText(String answerText) { this.answerText = answerText; }
	}


