package com.vti.utils;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {

	private Connection connection;

	/**
	 * Constructor for class JdbcUtils.
	 * 
	 * @Description: .
	 * @author: DangBlack
	 * @create_date: May 26, 2020
	 * @version: 1.0
	 * @modifer: DangBlack
	 * @modifer_date: May 26, 2020
	 * @throws IOException
	 */
	public JdbcUtils() throws IOException {
	}
	
	public Connection connect()
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException, SQLException {

		String url = "jdbc:mysql://localhost:3306/final_javacore?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";


		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);
		
		return connection;
	}

	/**
	 * This method is used for closing database.
	 * 
	 * @Description: .
	 * @author: DangBlack
	 * @create_date: May 26, 2020
	 * @version: 1.0
	 * @modifer: DangBlack
	 * @modifer_date: May 26, 2020
	 * @throws SQLException
	 */
	public void disconnect() throws SQLException {
		connection.close();
	}
}
