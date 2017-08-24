package com.library.book;

public class Journals extends Book {

	@Override
	public String getBookType() {
		// This method return booktype
		return this.getClass().getName();
	}

}
