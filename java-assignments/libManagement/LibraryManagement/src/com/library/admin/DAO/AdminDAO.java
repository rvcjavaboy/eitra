package com.library.admin.DAO;
import java.sql.*;

import com.library.db.MyConnection;
import com.library.libuser.Librarian;
public class AdminDAO {

	public static  boolean checkLogin(Librarian l) {
		/*
		 * This method check admin login
		 * @param Library class object
		 * return login status
		 * 
		 */
		Connection con=MyConnection.getConnection();
		try {
			Statement st=con.createStatement();
			ResultSet rst=st.executeQuery("select * from admin where user_id='"+l.getUsername()+"' AND password='"+l.getPassword()+"'");
			if(rst.next())
				return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}
	
}
