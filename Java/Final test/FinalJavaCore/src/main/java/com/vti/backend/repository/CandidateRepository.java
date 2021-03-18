package com.vti.backend.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.utils.JdbcUtils;

public class CandidateRepository {

	private JdbcUtils jdbcUtils;

	public CandidateRepository() throws IOException {
		jdbcUtils = new JdbcUtils();
	}

	public void registerExperienceCandidate(String firstName, String lastName, String email, String phone,
			int expInYear, String password)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// get connection
		Connection connection = jdbcUtils.connect();

		// create statement
		String sql = "INSERT INTO ExperienceCandidate  (firstName, lastname, email, phone, expInYear, `password`) VALUE (? , ? , ? , ?, ?, ?) ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setString(1, firstName);
		preparedStatement.setString(2, lastName);
		preparedStatement.setString(3, email);
		preparedStatement.setString(4, phone);
		preparedStatement.setInt(5, expInYear);
		preparedStatement.setString(6, password);

		// execute query
		preparedStatement.executeUpdate();
	}

	public void registerFresherCandidate(String firstName, String lastName, String email, String phone,
			String graduationRank, String password)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// get connection
		Connection connection = jdbcUtils.connect();

		// create statement
		String sql = "INSERT INTO FresherCandidate  (firstName, lastname, email, phone, graduationRank, `password`) VALUE (? , ? , ?, ?, ?, ?) ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setString(1, firstName);
		preparedStatement.setString(2, lastName);
		preparedStatement.setString(3, email);
		preparedStatement.setString(4, phone);
		preparedStatement.setString(5, graduationRank);
		preparedStatement.setString(6, password);

		// execute query
		preparedStatement.executeUpdate();

	}

	public boolean ExpCInfoIsCorrect(String firstName, String lastName, String email, String phone, int expInYear) {

		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

		if (!(9 <= phone.length() && phone.length() <= 12)) {
			return false;
		}
		if (!email.matches(regex)) {
			return false;
		}
		if (!(0 <= expInYear && expInYear <= 10)) {
			return false;
		}
		return true;
	}

	public boolean FresherCInfoIsCorrect(String firstName, String lastName, String email, String phone,
			String graduationRank) {

		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

		if (!(9 <= phone.length() && phone.length() <= 12)) {
			return false;
		}
		if (!email.matches(regex)) {
			return false;
		}
		if (!((graduationRank.equals("Excelence")) || (graduationRank.equals("Good"))
				|| (graduationRank.equals("Fair")) || graduationRank.equals("Poor"))) {
			return false;
		}
		return true;
	}

	public boolean searchByEmailExp(String email)
			throws SQLException, FileNotFoundException, ClassNotFoundException, IOException {
		// get connection
		Connection connection = jdbcUtils.connect();

		// create statement
		String sql = "SELECT * FROM ExperienceCandidate WHERE email = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setString(1, email);

		// execute query
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			return true;
		} else
			return false;
	}

	public boolean searchByEmailFresher(String email)
			throws SQLException, FileNotFoundException, ClassNotFoundException, IOException {
		// get connection
		Connection connection = jdbcUtils.connect();

		// create statement
		String sql = "SELECT * FROM FresherCandidate WHERE email = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setString(1, email);

		// execute query
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			return true;
		} else
			return false;
	}

	private static boolean uppercase(String password) {
		boolean isValid = false;

		for (int p = 0; p < password.length(); p++) {
			if (Character.isUpperCase(password.charAt(p))) {
				isValid = true;
			}
		}
		return isValid;
	}

	public boolean isLoginValid(String email, String password) {
		boolean emailIsValid = false;
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if (email.matches(regex)) {
			emailIsValid = true;
		}

		boolean passIsValid = false;
		if (6 <= password.length() && password.length() <= 12) {
			if (uppercase(password)) {
				passIsValid = true;
			}
		}

		if (emailIsValid && passIsValid) {
			return true;
		} else if (!emailIsValid) {
			return false;
		} else {
			return false;
		}
	}

	public boolean loginInfoIsValidExp(String email, String passowrd) throws SQLException, FileNotFoundException, ClassNotFoundException, IOException {
		// get connection
		Connection connection = jdbcUtils.connect();

		// create statement
		String sql = "SELECT email, `password` FROM ExperienceCandidate WHERE email = ? AND `password` = ? UNION SELECT email, `password` FROM FresherCandidate WHERE email = ? AND `password` = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, passowrd);
		preparedStatement.setString(3, email);
		preparedStatement.setString(4, passowrd);

		// execute query
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			return true;
		} else
			return false;
	}
}
