package com.library.book;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.library.date.DateUtilty;
import com.library.member.Student;

public class AddBook {
	
	private  java.util.Scanner scan=new java.util.Scanner(System.in);
	
	public Book addBooks() {
				/**
				 * this method get book details
				 * 
				 */
				Book b = null;
				int ch=0;
				String type=null;
				do {
				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("1	Study Book");
				System.out.println("2	Magzin");
				System.out.println("3	Jounrals");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.print("\t Enter yout choice ::\t");
				ch=scan.nextInt();
					if(ch==1) {
						b=new StudyBooks();
						type=StudyBooks.class.getName();
						break;
					}else if(ch==2) {
						b=new Magzines();
						type=Magzines.class.getName();
						break;
					}else { 
						b=new Journals();
						type=Journals.class.getName();
						break;
					}
				}
				while(ch!=999);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~        Enter Book Details        ~~~~~~~~~~~~~~~~~~~~~");
				System.out.print("\n \tBook Name ::\t");b.setBook_name(scan.next());
				System.out.print("\n \tAuhtor	::\t");b.setAuthor(scan.next());
				
				System.out.print("\n \tprice	::\t");b.setPrice(scan.nextDouble());
				System.out.print("\n \tRank No	::\t");b.setRank_no(scan.nextInt());
				System.out.print("\n \tQuantity	::\t"); b.setStatus(scan.nextInt());
				System.out.print("\n \tEdition	::\t");b.setEdition(scan.next());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				b.setDateOfPurchas(DateUtilty.getCurrentDate());		//add book to database
				//b.setType(type);
				return b;
		}
	
}
