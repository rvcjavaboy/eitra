/**
 * 
 */
package com.rvc.question;

/**
 * @author Ranjit Chavan
 * @Date Jul 12, 2017
 * @File Name Question.java
 */
public abstract class Question {

		protected String questionName,questionType;
		protected int questionPoint;
		
	

		public abstract void setQuestionName(String que);
		public abstract void setQuestionType(String s);
		public abstract void setQuestionPoint(int point);
		public abstract String getQuestionName();
		public abstract String getQuestionType();
		public abstract int getQuestionPoint();
	
	
}
