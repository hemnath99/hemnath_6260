package com.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class QuestionEntity {
	@Id
	private int qid;
	@Column
	private String questionEntity;
	
	@OneToMany (mappedBy="questionEntity", cascade=CascadeType.ALL)
	List<AnswerEntity> answerEntity;
	
	public QuestionEntity(int qid, String questionEntity) {
		super();
		this.qid = qid;
		this.questionEntity = questionEntity;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestionEntity() {
		return questionEntity;
	}
	public void setQuestionEntity(String questionEntity) {
		this.questionEntity = questionEntity;
	}
	public QuestionEntity() {
	
	}
	
	@Override
	public String toString() {
		return "QuestionEntity [qid=" + qid + ", questionEntity=" + questionEntity + "]";
	}
	
	public void setAnswer(List<AnswerEntity> list) {
		// TODO Auto-generated method stub
		
	}
	
}
