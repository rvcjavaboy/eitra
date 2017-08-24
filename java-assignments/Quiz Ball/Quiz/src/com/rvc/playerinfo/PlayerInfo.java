package com.rvc.playerinfo;

import java.io.IOException;

import com.rvc.quiz.FileLoader;

/**
 * 
 */

/**
 * @author Ranjit Chavan
 * @Date Jul 12, 2017
 * @File Name PlayerInfo.java
 */
public class PlayerInfo {

		public static Player getInfo(Player p){
			java.util.Scanner scan=new java.util.Scanner(System.in);
			System.out.println("What is your first name?");
			p.setFname(scan.next());
			System.out.println("What is your last name?");
			p.setLname(scan.next());
			System.out.println("What file stores your questions?");
			p.setFilename(scan.next());
			FileLoader file = null;
			try {
				file = new FileLoader(p.getFilename());
			} catch (IOException e) {
			System.out.println("File not found");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int noOfQuestion=file.noOfQuestionInFile();
			p.setNoOfQuestionFile(noOfQuestion);
			//ran=new int[noOfQuestion];
			System.out.println("How many questions would you like (out of "+noOfQuestion+")?");
			p.setNoOfQuestionWants(scan.nextInt());
			while(p.getNoOfQuestionWants()>noOfQuestion){
				System.out.println("Please enter valid number");
				
				p.setNoOfQuestionWants(scan.nextInt());
					
			}
			
			
			return p;
		}
	
}
