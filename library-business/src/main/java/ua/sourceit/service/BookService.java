package ua.sourceit.service;

import java.sql.SQLException;
import java.util.List;

import ua.sourceit.businessobject.Book;

public interface BookService {

	Book getBook(Integer id) throws SQLException;
	List<Book> getAllBooks() throws SQLException;
}
