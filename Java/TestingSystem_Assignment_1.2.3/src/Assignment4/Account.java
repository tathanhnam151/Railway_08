package Assignment4;
import java.util.Date;

public class Account {
	int id;
	String email;
	String username;
	String fullName;
	Department department;
	Position position;
	Date createDate;
	Group[] groups;
	
	public Account(String username) {
		this.username = username;
	}
}
