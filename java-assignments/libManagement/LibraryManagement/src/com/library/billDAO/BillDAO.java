package com.library.billDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.library.bill.Bill;
import com.library.db.MyConnection;

public class BillDAO {
	public static boolean updateBill(Bill b) {
		/**
		 * this method update bill details into database
		 * @param Bill class Object
		 * @return boolean status
		 */
		try {
			Connection con=MyConnection.getConnection();
			PreparedStatement pr=con.prepareStatement("insert into bill (date,memberid,amount) values(?,?,?)");
			pr.setString(1, b.getDate());
			pr.setInt(2, b.getMember_id());
			pr.setDouble(3, b.getAmount());
			pr.execute();
		return true;
		
		}catch(Exception e) {e.printStackTrace();}
		
		return false;
	}
}
