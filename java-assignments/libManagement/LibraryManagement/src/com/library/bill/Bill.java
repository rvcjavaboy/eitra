package com.library.bill;

import com.library.billDAO.BillDAO;

public class Bill {

	
	private int billNo,member_id;
	private String date;
	private double amount;

	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public boolean billCreate(Bill b) {
		/*
		 * This method create the 
		 * @param Bill class Object
		 * return bill success msg
		 */
		return this.billUpdate(b);  			
		
		
	}
	public boolean billUpdate(Bill b) {
		/*
		 * This method update bill into db
		 * @param bill class object
		 * @return bill success msg
		 * 
		 */
	return	BillDAO.updateBill(b);
		
		
	
	}


}
