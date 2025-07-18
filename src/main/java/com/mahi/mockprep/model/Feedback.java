package com.mahi.mockprep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity

public class Feedback {
	
	@Id
	@GeneratedValue( strategy =GenerationType.IDENTITY)
	long id ;
	

    @OneToOne
    private Answer answer;

    private String feedbackText;
    
    public Feedback() {
    	//default constructor
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public String getFeedbackText() {
		return feedbackText;
	}

	public void setFeedbackText(String feedbackText) {
		this.feedbackText = feedbackText;
	}
    
    
    
	

}
