/**
 * 
 */
package com.rvc.ass2;

/**
 * @author Ranjit Chavan
 * @Date Jul 6, 2017
 * @File Name ArrayDemo.java
 */
public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=1000;
		int a[]=new int[N*N*N*N];
	}

}

/*
Compile
The Program Compile fine becasue int array can check only the value type if the value int then compile fine

Run
Run time exception throw
Exception in thread "main" java.lang.NegativeArraySizeException
	at com.rvc.ass2.ArrayDemo.main(ArrayDemo.java:19)
	
at the running time array size should be in integer range



*/