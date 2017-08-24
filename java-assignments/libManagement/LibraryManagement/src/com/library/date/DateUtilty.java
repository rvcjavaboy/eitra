package com.library.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateUtilty {

	public static String getCurrentDate() {
		/**
		 * This method for current date calculation
		 * @return String cureent Date
		 */
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,0); 
		SimpleDateFormat dateOnly = new SimpleDateFormat("dd MM yyyy");
		return dateOnly.format(cal.getTime());
		
	}public static String getNextDate(int space) {
		/**
		 * This method for current date future date
		 * @param space how many days next
		 * @return String  due date
		 */
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,space); 
		SimpleDateFormat dateOnly = new SimpleDateFormat("dd MM yyyy");
		return dateOnly.format(cal.getTime());
		
		
	}
	public static long getDifference(String start,String end) {
		/**
		 * This method for calculation difference between two dates
		 * @param start due date,end current date
 		 * @return long how may days between two date
		 */
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		

		try {
		    Date date1 = myFormat.parse(start);
		    Date date2 = myFormat.parse(end);
		    long diff = date2.getTime() - date1.getTime();
		    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		
		return 0;
	}
}
