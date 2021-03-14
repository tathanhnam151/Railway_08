package Assignment4;

import java.util.Date;

public class Group {
	byte id;
	String name;
	Account creator;
	Date createDate;
	Account[] accounts;
	
	// Cau hinh b
	
//	public Group(String name, Account creator, Account[] accounts, Date createDate) {
//		this.name = name;
//		this.creator = creator;
//		this.accounts = accounts;
//		this.createDate= createDate;
//	}
	
	// Cau hinh c
	public Group(String name, Account creator, String[] usernames, Date createDate) {
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		accounts = new Account[usernames.length];
		for (int i = 0; i < usernames.length; i++) {
			Account account = new Account(usernames[i]);
			accounts[i] = account;
		}
	}
}
