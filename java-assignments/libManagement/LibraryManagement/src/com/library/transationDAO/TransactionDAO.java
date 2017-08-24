package com.library.transationDAO;

import java.sql.ResultSet;

import com.library.date.DateUtilty;
import com.library.db.MyConnection;
import com.library.tansaction.Transaction;

import java.sql.*;

public class TransactionDAO {
		private static String type=null;
		public static boolean startTransaction(int member_id,String book_name) {
				/**
				 * This method store transaction on database
				 * @return status of transaction
				 */
			try {
				
				Connection con=MyConnection.getConnection();
				PreparedStatement pr=con.prepareStatement("insert into transaction (member_id,book_id,dateofissue,duedate) value(?,?,?,?) ");
				pr.setInt(1, member_id);
				pr.setInt(2,getBookId(book_name));
				pr.setString(3, DateUtilty.getCurrentDate());
				pr.setString(4,DateUtilty.getNextDate(accountType(member_id)));
				pr.execute();
				return true;
			
			}catch(Exception e) {e.printStackTrace();}
		

			return false;
	}
		
		
		
		
		public static  int getBookId(String book_name) {
			/**
			 * This method return book id
			 * @param book_name
			 * @return book_id 
			 */
			try {
					Connection con=MyConnection.getConnection();
					Statement st=con.createStatement();
					ResultSet rst=st.executeQuery("select book_id from books where name='"+book_name+"'");
					if(rst.next()) {
						return rst.getInt(1);
					}
					
				
				
			}catch(Exception e) {e.printStackTrace();}
					return 0;	
		}
		
		
		public static int accountType(int member_id) {
				/**
				 * This method get account type
				 * @param  member_id
				 * @return account type
				 */
			try {
				Connection con=MyConnection.getConnection();
				Statement st=con.createStatement();
				ResultSet rst=st.executeQuery("select type from member where id='"+member_id+"'");
				if(rst.next()) {
				if(rst.getString(1).equals("Student")) {
					
					return 7;
					}else {
					return 10;
					}	
				}
				
			
			
				}catch(Exception e) {e.printStackTrace();}
		
			
			
			
			
			return 0;
		}
		
		
		public static boolean destroyTransaction(Transaction transaction) {
			/**
			 * This method destroy transaction 
			 * @param Transaction Object
			 * @return boolean success
			 */
			try {
				Connection con=MyConnection.getConnection();
				Statement st=con.createStatement();
				st.executeUpdate("delete from transaction where trans_id="+transaction.getTransa_id()+"");
				return true;
				
			
			
				}catch(Exception e) {e.printStackTrace();}
		
			
			
				
			
			
			
			
			return false;
		}
		
		
		public static Transaction retriveTransaction(int member_id,int  book_id) {
			/**
			 * This method retrive old transaction 
			 * @param member_id,book_id
			 * @return Transaction object
			 */
			Transaction t=new Transaction();
					
			try {
				Connection con=MyConnection.getConnection();
				Statement st=con.createStatement();
				ResultSet rst=st.executeQuery("select * from transaction where member_id="+member_id+" AND book_id="+book_id+"");
				if(rst.next()) {
				t.setTransa_id(rst.getInt(1));
				t.setMember_id(rst.getInt(2));
				t.setBook_id(rst.getInt(3));
				t.setDateofIssue(rst.getString(4));
				t.setDueDate(rst.getString(5));
				
				return t;
				}
				
			
			
				}catch(Exception e) {e.printStackTrace();}
			
				return null;
			
			
				
			
			
			
		}
		
	
}
