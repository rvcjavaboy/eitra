/**
 * 
 */
package com.rvc.question;

/**
 * @author Ranjit Chavan
 * @Date Jul 12, 2017
 * @File Name MCQuesation.java
 */
public class QuesationMC extends Question{

	private String answerMC,choice[];

	/**
	 * @return the answerMC
	 */
	
	
	public String getAnswerMC() {
		return answerMC;
	}

	/**
	 * @param answerMC the answerMC to set
	 */
	public void setAnswerMC(String answerMC) {
		this.answerMC = answerMC;
	}

	/**
	 * @return the choice
	 */
	public String[] getChoice() {
		return choice;
	}

	/**
	 * @param choice the choice to set
	 */
	public void setChoice(String[] choice) {
		this.choice = choice;
	}

	/* (non-Javadoc)
	 * @see com.rvc.question.Question#setQuestionName(java.lang.String)
	 */
	@Override
	public void setQuestionName(String que) {
		// TODO Auto-generated method stub
		super.questionName=que;
	}

	/* (non-Javadoc)
	 * @see com.rvc.question.Question#setQuestionType(java.lang.String)
	 */
	@Override
	public void setQuestionType(String s) {
		// TODO Auto-generated method stub
		super.questionType=s;
	}

	/* (non-Javadoc)
	 * @see com.rvc.question.Question#setQuestionPoint(int)
	 */
	@Override
	public void setQuestionPoint(int point) {
		// TODO Auto-generated method stub
		super.questionPoint=point;
	}

	/* (non-Javadoc)
	 * @see com.rvc.question.Question#getQuestionName()
	 */
	@Override
	public String getQuestionName() {
		// TODO Auto-generated method stub
		return questionName;
	}

	/* (non-Javadoc)
	 * @see com.rvc.question.Question#getQuestionType()
	 */
	@Override
	public String getQuestionType() {
		// TODO Auto-generated method stub
		return questionType;
	}

	/* (non-Javadoc)
	 * @see com.rvc.question.Question#getQuestionPoint()
	 */
	@Override
	public int getQuestionPoint() {
		// TODO Auto-generated method stub
		return questionPoint;
	}



	/* (non-Javadoc)
	 * @see com.rvc.question.Question#questionType(java.lang.String)
	 */

	
}
