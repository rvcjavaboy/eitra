package com.library.member;

public class Student extends MemberRecord{

	@Override
	public String getType() {
		// this method set member type
		return "Student";
	}

	@Override
	public int getMax_book_limit() {
		// this method set get max limit of user
		return 3;
	}

}
