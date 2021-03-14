package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.ScannerUtils;

public class Exercise2_3 {
	public void getGroup() throws Exception {
		String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);

		System.out.println("Connect successfully!");

		System.out.println("Nhap AuthorID cua Group can tim: ");
		int input = ScannerUtils.inputInt("Input must be int!");

		String sql = "SELECT * FROM `Group`  WHERE author_ID =" + input;

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		ResultSet resultSet = preparedStatement.executeQuery(sql);

		try {
			if (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				System.out.println("ID: " + id);
				System.out.println("Name: " + name);
			} else {
				throw new Exception("Cannot find department which has author_ID =" + input);
			}
		} catch (Exception e) {
			System.err.println("ngu!");
		}
	}
}
