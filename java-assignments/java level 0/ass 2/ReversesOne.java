/**
 * 
 */
package com.rvc.ass2;

/**
 * @author Ranjit Chavan
 * @Date Jul 6, 2017
 * @File Name ReversesOne.java
 */
public class ReversesOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[]={10.2,22.33,32.66,22.33,2};
		double rev[]=new double[arr.length];
		int size=arr.length-1;
		for(int i=0;i<arr.length;i++){
			rev[size]=arr[i];
			size--;
			
		}
		
		for(double d:rev){
			System.out.println(d);
			
		}
	}

}
