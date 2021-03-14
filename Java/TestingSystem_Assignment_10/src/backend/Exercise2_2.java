package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise2_2 {
	public void getGroup() throws Exception {
		String url = "jdbc:mysql://localhost:3306/Testing_System?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);

		System.out.println("Connect successfully!");

		Statement statement = connection.createStatement();

		String sql = "SELECT * FROM `Group`  WHERE GroupID = 5";

		ResultSet resultSet = statement.executeQuery(sql);

		try {
		if (resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			System.out.println("ID: " + id);
			System.out.println("Name: " + name);
		} else {
			throw new Exception("Cannot find department which has id = 5");
		}
		}
		catch(Exception e) { 
			System.err.println("ngu!");
		}
	}
}
