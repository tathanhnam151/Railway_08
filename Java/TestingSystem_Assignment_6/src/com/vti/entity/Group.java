package com.vti.entity;
import java.util.ArrayList;
import java.util.Date;

import com.vti.ScannerUtils;

public class Group {
	int id;
	String name;
	Account creator;
	Date createDate;
	private ArrayList<Account> accounts;
	
	public Group() {
		
	}
	
	public Group(byte id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public void input() {
		System.out.println("Tao mot nhom:");
		System.out.println("Nhap id: ");
		id = ScannerUtils.inputInt("Please input a id as int, please input again.");
		System.out.println("Nhap ten: ");
		name = ScannerUtils.inputString("Please input a name, please input again.");
	}
	
	public void addAccount() {
		accounts.add(new Account());
		System.out.println("Them account thanh cong!");
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
		

}


