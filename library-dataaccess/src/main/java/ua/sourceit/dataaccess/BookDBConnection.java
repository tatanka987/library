package ua.sourceit.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import ua.sourceit.dataaccess.Login;

public class BookDBConnection {

	private static Connection connection = null;
	
	private static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library",Login.getLogin(), Login.getPassword()); 
		return connection;
	}

	// Singleton pattern
	public static synchronized Connection getInstance() throws SQLException {
		if (connection == null) {
			connection = getConnection();
		}
		return connection;
	}
}
