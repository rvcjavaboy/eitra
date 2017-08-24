/**
 * 
 */
package com.rvc.book;

/**
 * @author Ranjit Chavan
 * @Date Jul 6, 2017
 * @File Name Book.java
 */


abstract class Author{

	protected String name,email,gender;
	
	
}


class Book extends Author{
	
	private String name;
	private Author a;
   private	double price;
	private int	qtyInStock ;
	
	Book(String name,Author author,double price){}
	
	Book(String name,Author author,double price,int qtyInStock){}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the a
	 */
	public Author getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(Author a) {
		this.a = a;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the qtyInStock
	 */
	public int getQtyInStock() {
		return qtyInStock;
	}

	/**
	 * @param qtyInStock the qtyInStock to set
	 */
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	
	
	
}
public class Library {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
