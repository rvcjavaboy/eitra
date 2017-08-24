package com.library.db;

import java.sql.DriverManager;

public class MyConnection {
	/**
	 * This class for Mysql Connection object creation 
	 * 
	 */
	private static java.sql.Connection con=null;
	
	
	public static java.sql.Connection getConnection() {
			/**
			 * this method for creating mysql connection
			 * @return Connection object
			 */
			try {
				Class.forName(Driver.CLASS);
				if(con==null)
					con=DriverManager.getConnection(Driver.CONNECTION,Driver.USER_NAME,Driver.PASSWORD);
					
			}catch(Exception e) {e.printStackTrace();}
		
		
		return con;
	}
	
	
}
