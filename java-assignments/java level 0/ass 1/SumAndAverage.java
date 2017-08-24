/**
 * 
 */
package com.rvc.ass1;

/**
 * @author Ranjit Chavan
 * @Date Jul 6, 2017
 * @File Name SumAndAverage.java
 */
public class SumAndAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("Enter First The Number");
		int start=s.nextInt();// Enter The First Number in Integer
		System.out.println("Enter Second The Number");
		int end=s.nextInt();// Enter The Second Number in Integer
		
		int sum=0;
		
		while(start<=end){
			
			sum+=start;
			start++;
		}
		
		System.out.println((double)sum/end);
	}

}
