package com.library.book;

public class Magzines extends Book{

	@Override
	public String getBookType() {
		// This method return booktype
		return this.getClass().getName();
	}

}
