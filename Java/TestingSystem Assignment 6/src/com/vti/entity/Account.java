package com.vti.entity;
import java.util.Arrays;
import java.util.Date;

import com.vti.ScannerUtils;

public class Account {
	int id;
	String email;
	String username;
	String fullName;
	Department department;
	Position position;
	Date createDate;
	private Group[] groups;
	int age;
	
	public Account() {
		}
	
	public Account(int id, String fullName) {
		this.id = id;
		this.fullName = fullName;
	}
	
	public void input() {
		System.out.println("Nhap id: ");
		id = ScannerUtils.inputInt("Please input a id as int, please input again.");
		System.out.println("Nhap ten: ");
		fullName = ScannerUtils.inputString("Please input a name, please input again.");
	}
	
	public void inputAge() {
		this.age = ScannerUtils.inputAge();
	}
	
	public void inputAccountAge() {
		this.age = ScannerUtils.inputAccountAge();
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", fullName=" + fullName + ", email=" + email + ", username=" + username
				+ ", department=" + department + ", position=" + position + ", createDate=" + createDate + ", groups="
				+ Arrays.toString(groups) + "]";
	}
	
	
}
