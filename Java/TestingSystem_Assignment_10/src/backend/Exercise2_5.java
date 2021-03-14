package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise2_5 {
	public boolean isGroupNameExists(String name) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);

		System.out.println("Connect successfully!");

		String sql = "SELECT * FROM `Group` WHERE name =" + name;

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		ResultSet resultSet = preparedStatement.executeQuery(sql);

		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	public void createDepartment(String name) throws Exception {

		String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);

		System.out.println("Connect successfully!");

		if (isGroupNameExists(name)) {
			throw new Exception("Group " + name + " is exists!");
		} else {
			String sql = "INSERT INTO `Group` (`name` ,		`author_ID`) VALUE				(" + name
					+ ",		4); ";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.execute();
		}

	}
}
