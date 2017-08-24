/**
 * 
 */
package com.rvc.ass1;

/**
 * @author Ranjit Chavan
 * @Date Jul 6, 2017
 * @File Name Fibonacci.java
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,n=0;
		for(int i=0;i<=20;i++){
			n=fibonacciNumber(i);
			System.out.print("\t"+n);
			sum+=n;
		}
		System.out.println("\nThe average is:."+(double)(n/20));
	}
	
	
	static int fibonacciNumber(int num){
		
		
		if(num==0)
			return 0;
		else if(num==1)
			return 1;
		else
			
			return fibonacciNumber(num-1)+fibonacciNumber(num-2);
		
		
	}

}
