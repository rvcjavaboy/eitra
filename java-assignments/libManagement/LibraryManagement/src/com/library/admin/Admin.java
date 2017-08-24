package com.library.admin;

import com.library.admin.DAO.AdminDAO;
import com.library.book.AddBook;
import com.library.book.Book;
import com.library.book.dao.AddBookDAO;
import com.library.db.MyConnection;
import com.library.libuser.Librarian;
import com.library.member.MemberRecord;
import com.library.member.Student;
import com.library.memberDAO.MemberRecordDAO;

public class Admin {
	private static java.util.Scanner scan=null;
	
	
	public static void run() {
		
		/**
		 * 	this method do add books,add member,issue book and return book 
		 * 
		 */
		int choice=0;
			do {
					showMainFun();
					choice=scan.nextInt();
					switch(choice) {
			
						case 1:
								AddBook b1=new AddBook();						//this case add books
								Book b=b1.addBooks();
								AddBookDAO.addBook(b);
								System.out.println("\n\t\t\tBook Sucessfully add\n");
						break;	
						
						case 2:
								MemberRecord m=new Student();					//this case add member 
								m=m.addUser();
								MemberRecordDAO.addMemeber(m);
								System.out.println("\n\t\t\tUser Added successfully\n");
							
						break;
							
						case 3:
							
								Librarian l=new Librarian();					//this case issues book
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~        Issue Book        ~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.print("\n\tEnter The Member id	::\t");
								int me=scan.nextInt();
								System.out.print("\n\tEnter The Book Name	::\t ");
								String book=scan.next();
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								
								if(!l.searchBook(book)) {									// search book available or not
									System.out.println("\n\t\t\tBook Not available \n");
									break;
								}else if(!l.verifyMember(me)) {								// verify member available or not
									System.out.println("\n\t\t Member Not Found please register and try again \n");
									break;
								}else {
								l.issueBook(me, book);										// issues books
								}
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								
							break;	
					
						case 4:															//this case return the book
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~        Return Book        ~~~~~~~~~~~~~~~~~~~~~~~~");
								
								 l=new Librarian();
								 System.out.print("\n\tEnter The Member Id	::\t");
								 me=scan.nextInt();
								 System.out.print("\n\tEnter The Book Id		::\t ");
								 book=scan.next();
								 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									
								 l.returnBook(me,Integer.parseInt(book));				//return book 
								 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									
							 break;
						case 5:
							
							break;
						case 6:
								System.exit(1);
						break;
					
						default:
								System.out.println("\t\twrong Choice");
						break;
					}
				}while(choice!=6);
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * this method get user name and password
		 * 
		 */
					scan=new java.util.Scanner(System.in);
					Librarian l=new Librarian();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("~~~~~~~~~~~~~~~~~	Library Management System	~~~~~~~~~~~~~~~~~~~~~");
					System.out.print("\tUser Name ::	");
					l.setUsername(scan.next());
					System.out.print("\n\tPassword ::	");
					l.setPassword(scan.next());
	
						if(AdminDAO.checkLogin(l)) {			//check user is valid or not 
							run();												// execute run method
						}else{
							System.out.println("login Falied !!!!!!!!");
						}
					
		
		
	}

	public static void showMainFun() {
		/**
		 * this method for the display main funcations library management
		 * 
		 * 
		 */
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~ 	Main Function	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
				System.out.println("\t\t1	Add Book");
				System.out.println("\t\t2	Add Student/Faculty");
				System.out.println("\t\t3 	Issue Book");
				System.out.println("\t\t4 	Return Book");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.print("\t Enter The Choice::\t");

		
		
		}
	
	
}
