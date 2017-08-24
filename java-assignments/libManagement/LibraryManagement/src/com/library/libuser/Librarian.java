package com.library.libuser;

import com.library.bill.Bill;
import com.library.book.Book;
import com.library.book.dao.AddBookDAO;
import com.library.date.DateUtilty;
import com.library.libuserDAO.LibrarianDAO;
import com.library.member.MemberRecord;
import com.library.member.Student;
import com.library.memberDAO.MemberRecordDAO;
import com.library.tansaction.Transaction;
import com.library.transationDAO.TransactionDAO;

public class Librarian {

	private String username,password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public boolean  searchBook(String name) {
		/**
		 * this method for searching book available or not
		 * @return boolean 
		 */
		
		return LibrarianDAO.searchBookDB(name);   //check book available or not
		
	}
	
	
	public boolean verifyMember(int member_id) {
		/**
		 * This method check member are exist or not
		 * @return boolean
		 */
		return LibrarianDAO.checkMember(member_id);		//check member exist or not
	}
	
	
	public boolean issueBook(int member_id,String book_name) {
		/**
		 * This method for issue the book
		 * @return boolean
		 */
		if(LibrarianDAO.checkBookissued(member_id)) {	//this method check no of book issued of user
		Transaction t=new Transaction();				
		t.createTransaction(member_id,book_name);		//transaction created	
		AddBookDAO.updateStatusDAO(TransactionDAO.getBookId(book_name), 1);   //update book status
		MemberRecordDAO.updateNoOfBookIssued(member_id,1);					//update book issued value
		
		}
		return false;
	}
	
	
	public double calculateFine(Transaction t,int account_type) {
		/**
		 * This method for calculating fine of member
		 * @return amount double
		 */
		long how_many_days=DateUtilty.getDifference(t.getDueDate(),DateUtilty.getCurrentDate());	//calculate fine
		return (how_many_days*2);
	}
	
	public boolean createBill(Transaction t,int account_type) {
		/**
		 * this method create bill
		 * @return boolean
		 */
		Bill b=new Bill();
		b.setAmount(this.calculateFine(t,account_type));	//calculate fine
		b.setDate(DateUtilty.getCurrentDate());		//set current date
		b.setMember_id(t.getMember_id());			// set member id
		if(b.billCreate(b)) {						// create bill and store into db
			
			System.out.println("\t\t\tFine amout ::		"+b.getAmount()+"	for you :>\n");			//fine of an member 
		}
		
		
		return false;
	}
	
	public boolean returnBook(int member_id,int book_id) {
			if(!this.verifyMember(member_id)) {
				System.out.println("\t\t\tMember not found !!!!\n");
			return false;
			}Transaction t=TransactionDAO.retriveTransaction(member_id, book_id);
			if(t==null) {
				System.out.println("\t\t\tTransaction Not Found !!!!\n");
			}else {
				int type=TransactionDAO.accountType(member_id);
				this.createBill(t,type);
				t.deleteTransaction(t);
				AddBookDAO.updateStatusDAO(book_id,2);
				MemberRecordDAO.updateNoOfBookIssued(member_id, 2);
			}
		return false;
	}
	
	
	
	
}
