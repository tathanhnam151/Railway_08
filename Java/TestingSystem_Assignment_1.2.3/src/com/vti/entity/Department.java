package com.vti.entity;

public class Department {
	private int id;
	private String name;

//public Department() {
//	}

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}