package com.library.member;

public class Faculty extends MemberRecord {

	@Override
	public String getType() {
		// this method set member type
		return this.getClass().getName();
	}

	@Override
	public int getMax_book_limit() {
		// this method set get max limit of user
		return 5;
	}

}
