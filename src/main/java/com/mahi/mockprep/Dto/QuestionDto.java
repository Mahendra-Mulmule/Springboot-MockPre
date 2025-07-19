package com.mahi.mockprep.Dto;

public class QuestionDto {
    private Long id;
    private String topic;
    private String questionText;

    public QuestionDto() {}

    public QuestionDto(Long id, String topic, String questionText) {
        this.id = id;
        this.topic = topic;
        this.questionText = questionText;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

    // Getters and setters
}
