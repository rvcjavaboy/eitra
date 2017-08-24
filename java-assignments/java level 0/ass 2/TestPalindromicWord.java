/**
 * 
 */
package com.rvc.ass2;

/**
 * @author Ranjit Chavan
 * @Date Jul 6, 2017
 * @File Name TestPalindromicWord.java
 */
public class TestPalindromicWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter The String");
		String name=new java.util.Scanner(System.in).next();
		int valid=0;
		boolean flag=true;
		
		char line[]=name.toCharArray();
		for(int i=0;i<line.length;i++)
		
			if(line[i]==line[0])
				valid++;
		
		if(valid==line.length){
			System.out.println(name+"  is not a palindrome");
			System.exit(0);
		}
		int j=line.length-1;
		for(int i=0;i<line.length;i++){
			
			if(line[i]!=line[j])
				flag=false;
			
			j--;
		}
		
		if(flag)
			System.out.println("palindrome");
		else
			System.out.println("Not palindrome");
		
	}

}
