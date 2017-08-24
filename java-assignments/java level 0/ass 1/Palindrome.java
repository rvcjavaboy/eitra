/**
 * 
 */
package com.rvc.ass1;

/**
 * @author Ranjit Chavan
 * @Date Jul 6, 2017
 * @File Name palindrome.java
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter The Numeber");
		
		int num=new java.util.Scanner(System.in).nextInt();// Enter The Number in Integer
		int temp=num;
		int rem,add=0;
			while(temp>0){
		
				rem=temp%10;
				add=(add*10)+rem;
				temp=temp/10;
			
			
			}
		
		if(num==add)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
		
		
		}

}
