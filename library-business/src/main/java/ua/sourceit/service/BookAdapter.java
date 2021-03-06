package ua.sourceit.service;

import ua.sourceit.businessobject.Book;
import ua.sourceit.dataaccess.dto.BookDTO;

public class BookAdapter {

	public static Book from(BookDTO dto) {
		Book book = new Book();
		book.setId(dto.getId());
		book.setAuthor(dto.getAuthor());
		book.setBookName(dto.getBookName());
		book.setYear(dto.getYear());
		book.setSummary(dto.getSummary());
		return book;
	}
	public static BookDTO toDto(Book book){
		BookDTO dto = new BookDTO();
		dto.setId(book.getId());
		dto.setAuthor(book.getAuthor());
		dto.setBookName(book.getBookName());
		dto.setYear(book.getYear());
		dto.setSummary(book.getSummary());
		return dto;
		
	}
}
