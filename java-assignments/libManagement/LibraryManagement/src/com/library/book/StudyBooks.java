package com.library.book;

public class StudyBooks extends Book{

	@Override
	public String getBookType() {
		// This method return booktype
		return this.getClass().getName();
	}

}
