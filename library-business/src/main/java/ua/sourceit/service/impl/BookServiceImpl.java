package ua.sourceit.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ua.sourceit.businessobject.Book;
import ua.sourceit.dataaccess.dao.BookDAO;
import ua.sourceit.dataaccess.dto.BookDTO;
import ua.sourceit.service.BookAdapter;
import ua.sourceit.service.BookService;

public class BookServiceImpl implements BookService {

	private BookDAO bookDAO;
	
	public BookServiceImpl() {
		bookDAO = new BookDAO();
	}
	
	public Book getBook(Integer id) throws SQLException {
		// Adapt DataTransferObject(BookDTO) to BusinessObject(Book)
		return BookAdapter.from(bookDAO.find(id));
	}

	public List<Book> getAllBooks() throws SQLException {
		ArrayList<Book> books = new ArrayList<Book>();
		for (BookDTO dto : bookDAO.find()) {
			// Adapt DataTransferObject(BookDTO) to BusinessObject(Book)
			books.add(BookAdapter.from(dto));
		}
		return books;
	}
}