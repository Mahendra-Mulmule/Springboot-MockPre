package com.mahi.mockprep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Answer")
public class Answer {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	long id;
	

    @ManyToOne
    private User user;

    @ManyToOne
    private Question question;

    private String answerText;
    
    public Answer() {
    	//default constructor
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	
	
	
	
	
	
	
	
	
	

}
