import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program1 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);
		
		System.out.println("Connect successfully!");

		Statement statement = connection.createStatement();

		String sql = "INSERT INTO `Group` (`name`, author_ID) " + "VALUES 				(?, ? )";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		String groupName = "AES Developer";
		short authorId = 1;
		
		preparedStatement.setString(1, groupName);
		preparedStatement.setShort(2, authorId);
		
		int effetedRecordAmount = statement.executeUpdate(sql);

		System.out.println("Effeted Record Amount: " + effetedRecordAmount);

		String sql1 = "SELECT * FROM `group`";

		Statement statement1 = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql1);

		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			System.out.println("ID: " + id);
			System.out.println("Name: " + name);

			connection.close();
		}
	}
}			
