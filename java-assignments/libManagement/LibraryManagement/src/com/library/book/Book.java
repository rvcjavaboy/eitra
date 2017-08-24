package com.library.book;

public abstract class Book {

	private int book_id,rank_no,status;
	private String book_name,author,edition,dateOfPurchas,type;
	private double price;
	
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getRank_no() {
		return rank_no;
	}
	public void setRank_no(int rank_no) {
		this.rank_no = rank_no;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getDateOfPurchas() {
		return dateOfPurchas;
	}
	public void setDateOfPurchas(String dateOfPurchas) {
		this.dateOfPurchas = dateOfPurchas;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void BookDetails(int book_id) {
			/**
			 * this method view book details
			 * 
			 */
		
	}
	public boolean updateStatus() {
		
			if(status>-1) {
				status--;
				return true;
			}
		return false;
	}
	
	
	public abstract String getBookType();
}
