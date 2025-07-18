package com.mahi.mockprep.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	long id;
	
	private String topic;
	private String questiontext;
	
	public Question() {
		//default constructor 
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getQuestiontext() {
		return questiontext;
	}
	public void setQuestiontext(String questiontext) {
		this.questiontext = questiontext;
	}
	

}
