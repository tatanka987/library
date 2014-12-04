package ua.sourceit.dataaccess.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ua.sourceit.dataaccess.BookDBConnection;
import ua.sourceit.dataaccess.dto.BookDTO;

public class BookDAO implements GenericDAO<Integer, BookDTO>{
	
	private static final String FIND_BY_ID_SQL = "SELECT * FROM books WHERE id = ?";
	private static final String FIND_BY_SQL = "SELECT * FROM books";
	
	public BookDTO find(Integer id) throws SQLException {
		
		Connection connection = BookDBConnection.getInstance();
		BookDTO result = null;
		
		// try-with-resources - will be closed automatically
		try (PreparedStatement stmt = connection.prepareStatement(FIND_BY_ID_SQL)) {
			stmt.setInt(1, id);
				
			// try-with-resources - will be closed automatically
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					result = getBookDtoFromResultSet(rs);
				}
			}
		} catch (SQLException e) {
			
			//show error to know the problem
			e.printStackTrace();
		}
		
		return result;
	}

	private BookDTO getBookDtoFromResultSet(ResultSet rs) throws SQLException {
		BookDTO dto = new BookDTO();
		dto.setId(rs.getInt("ID"));
		dto.setAuthor(rs.getString("AUTHOR"));
		dto.setBookName(rs.getString("NAME"));
		dto.setYear(rs.getInt("YEAR"));
		dto.setSummary(rs.getString("SUMMARY"));
				
		return dto;
	}

	public List<BookDTO> find() throws SQLException {
		ArrayList<BookDTO> book2 =  new ArrayList<BookDTO>();
		
		Connection connection = BookDBConnection.getInstance();
		BookDTO result = null;
		
		try (PreparedStatement stmt = connection.prepareStatement(FIND_BY_SQL)) {
							
			// try-with-resources - will be closed automatically
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					result = getBookDtoFromResultSet(rs);
					book2.add(result);
				}
			}
		} catch (SQLException e) {
			
			//show error to know the problem
			e.printStackTrace();
		}
		
		return book2;
	    
	}

	public Integer save(BookDTO value) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(BookDTO value) {
		// TODO Auto-generated method stub
		
	}

	public void delete(BookDTO value) {
		// TODO Auto-generated method stub
		
	}
}
