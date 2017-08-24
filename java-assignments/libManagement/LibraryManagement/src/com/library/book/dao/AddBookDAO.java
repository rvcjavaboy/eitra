package com.library.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.library.book.Book;
import com.library.db.MyConnection;

public class AddBookDAO {

	public static boolean addBook(Book b) {
		/**
		 * This method add Book into database
		 * @param Book class object
		 * @return boolean success 
		 */
		try {
			Connection con=com.library.db.MyConnection.getConnection();
			PreparedStatement pr=con.prepareStatement("insert into books (name,author,rankno,status,edition,dateofpurchase,type)values(?,?,?,?,?,?,?)");
			pr.setString(1,b.getBook_name());
			pr.setString(2, b.getAuthor());
			pr.setInt(3, b.getRank_no());
			pr.setInt(4, b.getStatus());
			pr.setString(5, b.getEdition());
			pr.setString(6, b.getDateOfPurchas());
			pr.setString(7,b.getBookType());
			pr.execute();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;	
		}
	}
	public static boolean updateStatusDAO(int book_id,int choice) {
		
		try {
			Connection con=com.library.db.MyConnection.getConnection();
			Statement st=con.createStatement();
			if(choice==1) {
			st.executeUpdate("update books set status="+(getStatus(book_id)-1)+" where book_id="+book_id+"");
			}else{
				st.executeUpdate("update books set status="+(getStatus(book_id)+1)+" where book_id="+book_id+"");
					
				
			}return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;	
		}
		
		
		
		
	}public static int getStatus(int book_id) {
		
		try {
			Connection con=MyConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rst=st.executeQuery("select status from books where book_id="+book_id+"");
			if(rst.next()) {
				return rst.getInt(1);
			}
			
			
			
		}catch(Exception e) {e.printStackTrace();}
		
		
		
		
		
		return 0;
		
	}
}
