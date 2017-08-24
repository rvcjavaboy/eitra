package com.library.tansaction;

import com.library.transationDAO.TransactionDAO;

public class Transaction {

	private int transa_id,member_id,book_id;
	private  String dateofIssue,dueDate;
	public int getTransa_id() {
		return transa_id;
	}
	public void setTransa_id(int transa_id) {
		this.transa_id = transa_id;
	}
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getDateofIssue() {
		return dateofIssue;
	}
	public void setDateofIssue(String dateofIssue) {
		this.dateofIssue = dateofIssue;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	public boolean createTransaction(int member_id,String book_name) {
		/**
		 * This method to create transaction 
		 * @return transcation status
		 */
		
		return TransactionDAO.startTransaction(member_id, book_name);   //update transcation
		
	}
	public boolean deleteTransaction(Transaction t) {
		/**
		 * this method to delete transaction
		 * @return delete transaction status
		 * 
		 */
		return TransactionDAO.destroyTransaction(t);		//delete the transaction

	}
	
	public Transaction retriveTransaction(int member_id,int book_id) {
		/**
		 * this method to retrive the transaction
		 * @return Transaction object
		 */
		return TransactionDAO.retriveTransaction(member_id, book_id);	//retrive the transaction
		
	
	}
	
}
