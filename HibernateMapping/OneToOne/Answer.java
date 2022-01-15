package com.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int id_a;
	@Column
	private String answer;
	
	@OneToOne(mappedBy="answer")
	
	Question question;
	
	
	
	
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public int getId_a() {
		return id_a;
	}
	public void setId_a(int id_a) {
		this.id_a = id_a;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Answer(int id_a, String answer) {
		super();
		this.id_a = id_a;
		this.answer = answer;
	}
	public Answer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Answer [id_a=" + id_a + ", answer=" + answer + "]";
	}
}
