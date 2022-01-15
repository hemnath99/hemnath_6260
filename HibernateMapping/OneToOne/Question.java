package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Question {

	@Id
	private int Id_q;
	@Column
	private String question;
	
	@OneToOne
	@JoinColumn(name= "id")
	Answer answer;
	
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public int getId_q() {
		return Id_q;
	}
	public void setId_q(int id_q) {
		Id_q = id_q;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Question(int id_q, String question) {
		super();
		Id_q = id_q;
		this.question = question;
	}
	public Question() {
		
	}
	@Override
	public String toString() {
		return "Question [Id_q=" + Id_q + ", question=" + question + "]";
	}
}