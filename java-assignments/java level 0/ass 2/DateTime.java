/**
 * 
 */
package com.rvc.ass2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Ranjit Chavan
 * @Date Jul 6, 2017
 * @File Name DateTime.java
 */
public class DateTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDateFormat temp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d=new Date();
		String s=temp.format(d);
		System.out.print(s);

	}

}
