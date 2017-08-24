/**
 * 
 */
package com.rvc.question;

/**
 * @author Ranjit Chavan
 * @Date Jul 12, 2017
 * @File Name TFQuestion.java
 */
public class QuestionTF extends Question{

	/* (non-Javadoc)
	 * @see com.rvc.question.Question#questionName(int)
	 */
	private boolean answer;
	/**
	 * @return the answer
	 */
	public boolean isAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(boolean answer) {
		this.answer = answer;
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
