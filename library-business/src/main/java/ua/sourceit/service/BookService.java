package ua.sourceit.service;

import java.sql.SQLException;
import java.util.List;

import ua.sourceit.businessobject.Book;


public interface BookService {

	Book getBook(Integer id) throws SQLException;
	List<Book> getAllBooks() throws SQLException;
	void addBook (Integer id, String author, String bookName, Integer year, String summary) throws SQLException;
	void updateBook(Integer id, String author, String bookName, Integer year, String summary) throws SQLException;
	void deleteBook(Integer id) throws SQLException;
}
