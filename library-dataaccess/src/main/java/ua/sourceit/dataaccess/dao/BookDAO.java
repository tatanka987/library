package ua.sourceit.dataaccess.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ua.sourceit.dataaccess.BookDBConnection;
import ua.sourceit.dataaccess.dto.BookDTO;


public class BookDAO implements GenericDAO<Integer, BookDTO> {

	private static final String FIND_BY_ID_SQL = "SELECT * FROM books WHERE id = ?";
	private static final String FIND_BY_SQL = "SELECT * FROM books";
	private static final String ADD_TO_SQL = "INSERT INTO books (author, name, year, summary) VALUES (?, ?, ?, ?)";
	private static final String UPDATE_SQL = "UPDATE books SET author=?, name=?, year=?, summary=? WHERE id=?"; 
	private static final String DELETE_BY_ID_SQL = "DELETE FROM books WHERE id=?"; 

	public BookDTO find(Integer id) throws SQLException {

		Connection connection = BookDBConnection.getInstance();
		BookDTO result = null;

		// try-with-resources - will be closed automatically
		try (PreparedStatement stmt = connection
				.prepareStatement(FIND_BY_ID_SQL)) {
			stmt.setInt(1, id);

			// try-with-resources - will be closed automatically
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					result = getBookDtoFromResultSet(rs);
				}
			}
		} catch (SQLException e) {

			// show error to know the problem
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
		ArrayList<BookDTO> bookDTO = new ArrayList<BookDTO>();

		Connection connection = BookDBConnection.getInstance();
		BookDTO result = null;

		try (PreparedStatement stmt = connection.prepareStatement(FIND_BY_SQL)) {

			// try-with-resources - will be closed automatically
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					result = getBookDtoFromResultSet(rs);
					bookDTO.add(result);
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return bookDTO;

	}

	public void save(BookDTO value) throws SQLException {
		
		Connection connection = BookDBConnection.getInstance();
		
		String author = value.getAuthor();
		String name = value.getBookName();
		Integer year = value.getYear();
		String summary = value.getSummary();
		
		try {
            PreparedStatement st = connection.prepareStatement(ADD_TO_SQL);
            st.setString(1, author);
            st.setString(2, name);
            st.setInt(3, year );
            st.setString(4, summary);
            st.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	public void update(BookDTO value) throws SQLException {
		Connection connection = BookDBConnection.getInstance();
		
		Integer id = value.getId();
		String author = value.getAuthor();
		String name = value.getBookName();
		Integer year = value.getYear();
		String summary = value.getSummary();
		
		try {
            PreparedStatement st = connection.prepareStatement(UPDATE_SQL);
            st.setString(1, author);
            st.setString(2, name);
            st.setInt(3, year );
            st.setString(4, summary);
            st.setInt(5,id);
            st.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	public void delete(Integer id) throws SQLException {
		Connection connection = BookDBConnection.getInstance();
		
		try {
            PreparedStatement st = connection.prepareStatement(DELETE_BY_ID_SQL);
            st.setInt(1, id);
            st.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
