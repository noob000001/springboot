package com.kh.bookmanager.book;

import java.util.List;

public class BookController {
	
	private BookService bookService =  new BookService();
	
	

	public List<Book> searchBookByTitle(String keyword) {
		return bookService.findBooksByTitle(keyword);
	}

	public List<Book> searchBookWithRank() {
		return bookService.findBooksWithRank();
	}
	
	public List<Book> searchAllBooks() {
		return bookService.findAllBooks();
	}

	public boolean registBook(Book registBook) {
		return bookService.persistBook(registBook);
	}

	public boolean modifyBook(Long bkIdx, String info) {
		return bookService.modifyBook(bkIdx, info);
	}

	public boolean removeBook(Long bkIdx) {
		return bookService.removeBook(bkIdx);
	}
	
}
