/**
 * 
 */
package com.rvc.quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.rvc.playerinfo.Player;
import com.rvc.question.Question;

/**
 * @author Ranjit Chavan
 * @Date Jul 12, 2017
 * @File Name FileParse.java
 */
public class FileParse {

	
	ArrayList<Question> filedata=new ArrayList<Question>();;
/*
 * 
 * file data parsing store into arraylist
 * 	
 */
	
public ArrayList<Question> FileParser(Player p) throws IOException{
	
		try {
		BufferedReader	br=new BufferedReader(new FileReader(new File("d:\\"+p.getFilename())));
		br.readLine();
		String line=br.readLine();
		while(line!=null){
		//	split the question type and the point of the question
			String sp[]=line.split(" ");
			
			if(sp[0].equals("TF")){
			//if block for true false question
					com.rvc.question.QuestionTF tf=new com.rvc.question.QuestionTF();
					tf.setQuestionType("TF");
					tf.setQuestionPoint(Integer.parseInt(sp[1]));
			
					tf.setQuestionName(br.readLine());
					
					tf.setAnswer(Boolean.parseBoolean(br.readLine()));
					filedata.add(tf);
			}else if(sp[0].equals("SA")){
				//if block for short question
					com.rvc.question.QuestionSA sa=new com.rvc.question.QuestionSA();
					sa.setQuestionType("SA");
					sa.setQuestionPoint(Integer.parseInt(sp[1]));
					sa.setQuestionName(br.readLine());
					sa.setAnswerSA(br.readLine());
					filedata.add(sa);
			
					
					
					
					
					
					
				}else if(sp[0].equals("MC")){
					//if block for multiple choice question
					com.rvc.question.QuesationMC mc=new com.rvc.question.QuesationMC();
					mc.setQuestionType("MC");
					mc.setQuestionPoint(Integer.parseInt(sp[1]));
					mc.setQuestionName(br.readLine());
					String s[]=new String[Integer.parseInt(br.readLine())];
					for(int i=0;i<s.length;i++){
						
					
						s[i]=br.readLine();
						
					}
					mc.setChoice(s);
					mc.setAnswerMC(br.readLine());
					filedata.add(mc);
					
					
					
				}else{
					System.out.println("File Not in Well format");
					
				}
			line=br.readLine();
			}
			//System.out.print("Hello");
			
			
			
			
		
		
		return filedata;
		
		
		
		
		
		
		
	//	}
		
		
		} catch (IOException e) {
			
			System.out.println("File not found !!!!");
		}
		return filedata;
		
	
	
}
}
