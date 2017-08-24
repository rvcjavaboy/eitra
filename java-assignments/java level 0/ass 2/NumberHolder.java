/**
 * 
 */
package com.rvc.ass2;

/**
 * @author Ranjit Chavan
 * @Date Jul 6, 2017
 * @File Name NumberHolder.java
 */
public class NumberHolder {

	/**
	 * @param args
	 */
	public int anInt;
	public float aFloat;
	
	
	public static void main(String[] args) {
	
		NumberHolder n=new NumberHolder();
		n.aFloat=(float) 20.55;
		n.anInt=30;
		
		System.out.println(n.aFloat);
		System.out.println(n.anInt);
		
	
	}

}
