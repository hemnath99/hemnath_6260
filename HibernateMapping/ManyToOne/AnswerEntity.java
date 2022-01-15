package com.entity;

import javax.persistence.*;

@Entity
public class AnswerEntity {
	@Id
	private int aid;
	@Column
	private String answerEntity;
	
	@ManyToOne
	QuestionEntity questionEntity;
	  
	public AnswerEntity(int aid, String answerEntity) {
		super();
		this.aid = aid;
		this.answerEntity = answerEntity;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswerEntity() {
		return answerEntity;
	}
	public void setAnswerEntity(String answerEntity) {
		this.answerEntity = answerEntity;
	}
	@Override
	public String toString() {
		return "AnswerEntity [aid=" + aid + ", answerEntity=" + answerEntity + "]";
	}
	
	public AnswerEntity() {
		
	}
	public void setQuestion(QuestionEntity q1) {
		this.questionEntity=q1;
	}
	
}
