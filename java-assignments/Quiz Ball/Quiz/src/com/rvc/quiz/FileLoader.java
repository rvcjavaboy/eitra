/**
 * 
 */
package com.rvc.quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ranjit Chavan
 * @Date Jul 12, 2017
 * @File Name FileLoader.java
 */
public class FileLoader {
BufferedReader br;
	
	public FileLoader(String fileName) throws IOException{
		
		try {
			br=new BufferedReader(new FileReader(new File("d:\\"+fileName)));
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found !!!!");
		}
		
	}
	
	public int noOfQuestionInFile(){
		
		
		
		
		try {
			br.mark(1);
			return Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
		System.out.println("File is Empty");
		return 0;
		
		}
		
	}
}
