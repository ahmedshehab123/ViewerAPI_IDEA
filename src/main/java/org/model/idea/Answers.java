package org.model.idea;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="question_answers")
public class Answers {
	private int answerID;
	private int userID;
	private int questionID;
	private boolean answer;
	@Id
	@Column(name="answer_id",nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getAnswerID() {
		return answerID;
	}
	public void setAnswerID(int answerID) {
		this.answerID = answerID;
	}
	@Column(name="user_id",nullable=false)
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	@Column(name="ques_id",nullable=false)
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	@Column(name="answer",nullable=false)
	public boolean isAnswer() {
		return answer;
	}
	public void setAnswer(boolean answer) {
		this.answer = answer;
	}
	

}
