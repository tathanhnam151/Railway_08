package com.vti.entity;

import java.util.Date;

public class Account {
	private int id;
	private String email;
	private String username;
	private String fullName;
	private Department department;
	private Position position;
	private Date createDate;
	private Group[] groups;
	
	public Account(String username) {
		this.username = username;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public void setDate(Date date) {
		this.createDate = date;
	}
	
	public void setGroup(Group[] group) {
		this.groups = group;
	}
}
