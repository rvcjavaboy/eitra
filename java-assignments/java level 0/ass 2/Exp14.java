/**
 * 
 */
package com.rvc.ass2;

/**
 * @author Ranjit Chavan
 * @Date Jul 6, 2017
 * @File Name Exp14.java
 */
public class Exp14 {
	public static void main(String ar[]){
		int N=1000;
		int[] a = new int[N]; 
		a[0] = 0; 
		a[1] = 1;
		for (int i = 0; i < N; i++) 
			a[i] = a[i-1] + a[i-2]; 
		
		
		System.out.println(a[i]);
		
		
	}
}
/*

i var is local variable of the for loop they cannot access out side of the loop

*/