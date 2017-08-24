package com.library.member;

import com.library.date.DateUtilty;
import com.library.memberDAO.MemberRecordDAO;

public abstract class MemberRecord {
	
	private int member_id,number_of_book_issued,max_book_limit;
	private String type,dateofMembership,name,address,phoneno;
	
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public int getNumber_of_book_issued() {
		return number_of_book_issued;
	}
	public void setNumber_of_book_issued(int number_of_book_issued) {
		this.number_of_book_issued = number_of_book_issued;
	}
	public String getDateofMembership() {
		return dateofMembership;
	}
	public void setDateofMembership(String dateofMembership) {
		this.dateofMembership = dateofMembership;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public abstract String getType();
	public abstract int getMax_book_limit();
	
	public  void retriveMember(int member_id) {
			/**
			 * This method  retrive user details
			 * @param member_id 
			 */
		MemberRecordDAO.retriveUserDetails(member_id);
	
	}
	
		public MemberRecord addUser() {
			/**
			 * This method collect user details
			 *  @return MemberRecord
			 */
		MemberRecord m=null;
		int choice=0;
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~        Enter User Details        ~~~~~~~~~~~~~~~~~~~~~");
		do {
			System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("\t\t~~~~~~~~~	Select Account Type   ~~~~~~~~~");
			
			System.out.println("1	Student");
			System.out.println("2	Faculty");
			System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("\tEnter Yout Choice	::\t");
			choice=scan.nextInt();
			if(choice==1) {
				m=new Student();
				break;
			}else {
				
				m=new Faculty();
				break;
			}
		}while(choice!=3);
		
		System.out.print("\n\tName		::\t");m.setName(scan.next());
		System.out.print("\n\tAddress		::\t");m.setAddress(scan.next());
		System.out.print("\n\tPhone No	::\t");m.setPhoneno(scan.next());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		m.setDateofMembership(DateUtilty.getCurrentDate());
		m.setNumber_of_book_issued(0);

		
		
		return m;
	}
	
	
	
	
	
	
}
