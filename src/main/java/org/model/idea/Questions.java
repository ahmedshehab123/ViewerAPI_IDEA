package org.model.idea;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Questions {
	private int questionID;
	private String question;
	private String realAnswer;
	private int adminID;
	@Id
	@Column(name="q_id",nullable=false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	@Column(name="question",nullable=false)
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	@Column(name="answer",nullable=false)
	public String getRealAnswer() {
		return realAnswer;
	}
	public void setRealAnswer(String realAnswer) {
		this.realAnswer = realAnswer;
	}
	@Column(name="admin_id",nullable=false)
	public int getAdminID() {
		return adminID;
	}
	
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	
	
	

}
