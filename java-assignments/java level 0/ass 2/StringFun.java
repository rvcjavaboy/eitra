/**
 * 
 */
package com.rvc.ass2;

/**
 * @author Ranjit Chavan
 * @Date Jul 6, 2017
 * @File Name StringFun.java
 */
public class StringFun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 
		 * STA  1
		 
		 */
		
		String first="Ranjit",second="Ranjit";
		System.out.println(first+"equalse"+second+" or not"+first.equals(second));
		System.out.println(first+"equals Ignore Case"+second+" or not"+first.equalsIgnoreCase(second));
		System.out.println(first+"is contains Ra"+first.contains("Ra"));
		System.out.println(first+"is starts with Ra"+first.startsWith("Ra"));
		System.out.println(first+"is starts with Ra"+first.endsWith("it"));
		System.out.println("Substringof Ranjit to an"+first.compareTo("Ra"));
		String s[]=first.split("_");
		for(String ss:s)
				System.out.println(ss);
		
		
		
		
	}

}
