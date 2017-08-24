package com.library.memberDAO;

import java.sql.*;

import com.library.db.MyConnection;
import com.library.member.MemberRecord;

public class MemberRecordDAO {

	public static void retriveUserDetails(int member_id) {
		/**
		 * This method retrive user details
		 * 
		 */
		try {

			java.sql.Connection con=com.library.db.MyConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rst=st.executeQuery("select * from member where id="+member_id+"");
			if(rst.next()) {
					System.out.println("Id	:."+rst.getInt(1));
					System.out.println("Name :."+rst.getString(5));
					System.out.println("Address	:."+rst.getString(6));
					System.out.print("Phone No	:."+rst.getString(7));
					System.out.println("Accout Type	:."+rst.getString(2));
					System.out.println("Date Member Ship Joining	:."+rst.getString(3));
					System.out.println("Max Book Limit	:."+rst.getInt(4));
					System.out.println("No of Book Issued	:."+rst.getInt(8));
					
			}
			
			
		}catch(Exception e) {e.printStackTrace();}
		
		
		
		
	}
	
	public static boolean addMemeber(MemberRecord m) {
		/**
		 * This method add user into database
		 * @param MemberRecord
		 * 
		 */
		try {
			
			java.sql.Connection con=com.library.db.MyConnection.getConnection();
			PreparedStatement pr=con.prepareStatement("insert into member (type,dateofmem,maxbooklimit,name,address,phone,nobookissued) values(?,?,?,?,?,?,?)");
			pr.setString(1, m.getType());
			pr.setString(2, m.getDateofMembership());
			pr.setString(3,""+m.getMax_book_limit());
			pr.setString(4,m.getName());
			pr.setString(5, m.getAddress());
			pr.setString(6, m.getPhoneno());
			pr.setInt(7, m.getNumber_of_book_issued());
			pr.execute();
			
		return true;
		}catch(Exception e) {e.printStackTrace();}
		
		
		
		return false;
	}
	
	
	public static boolean updateNoOfBookIssued(int member_id,int choice) {
		/**
		 * This method update member book issued status
		 * @param member_id and choice is issue or return book;
		 * @return false;
		 */
		try {
			Connection con=com.library.db.MyConnection.getConnection();
			Statement st=con.createStatement();
			if(choice==1) {
			st.executeUpdate("update member set nobookissued="+(getNoOfBookIssued(member_id)+1)+" where id="+member_id+"");
			}else{
				st.executeUpdate("update member set nobookissued="+(getNoOfBookIssued(member_id)-1)+" where id="+member_id+"");
					
				
			}return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;	
		}
		
		
		
		
	}
	public static int getNoOfBookIssued(int member_id) {
		/**
		 * This method return no of book issued by member
		 * @param member_id
		 * @return noofbookissued
		 */
		try {
			Connection con=MyConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rst=st.executeQuery("select nobookissued from member where id="+member_id+"");
			
			if(rst.next())
				return rst.getInt(1);
			
			
		}catch(Exception e){e.printStackTrace();}
		
		
		
		
		return 0;
	}
	
	
	
}
	
	
