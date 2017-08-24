package com.library.libuserDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.library.db.MyConnection;
import com.library.member.Faculty;
import com.library.member.Student;

public class LibrarianDAO {

	public static boolean searchBookDB(String name) {
		/**
		 * this method check book available or not in library
		 * @return boolean
		 */
		try {
			
			java.sql.Connection con=com.library.db.MyConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rst=st.executeQuery("select status from books where name='"+name+"'");
			if(rst.next()) {
				int status=rst.getInt(1);
				if(status>0) {
					return true;
				}
			}
			
			
		}catch(Exception e) {e.printStackTrace();}
		
		
		
		
		
		
		return false;
	}
	
	
	public static boolean checkMember(int member_id) {
			/**
			 * this method check member are register or not 
			 * @return boolean
			 */
		try {

			java.sql.Connection con=com.library.db.MyConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rst=st.executeQuery("select * from member where ID="+member_id+"");
			if(rst.next()) {
				
					return true;
			
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;

		
		
	}public static boolean checkBookissued(int member_id) {
			
		/**
			 * this method check member can issued book  or not
			 * @return boolean
			 */
		try {

			java.sql.Connection con=com.library.db.MyConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rst=st.executeQuery("select nobookissued,type from member where ID="+member_id+"");
			if(rst.next()) {
				
				if("Student".equals(rst.getString(2))) {

					if(rst.getInt(1)>3)
					{
					//	System.out.println("MAX"+rst.getInt(1));
						return false;
					}
						
				}else if("Faculty".equals(rst.getString(2))){
					if(rst.getInt(1)>5)
						return false;
				
				}
				
				return true;
			
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;

		
		
	}
	
	
}
