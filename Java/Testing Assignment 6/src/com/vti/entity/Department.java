package com.vti.entity;

import com.vti.ScannerUtils;

public class Department {
	int id;
	String name;

	public Department() {
	}

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Question 9
	public void input() {
		System.out.println("Nhap id: ");
		id = ScannerUtils.inputInt("Please input a id as int, please input again.");
		System.out.println("Nhap ten: ");
		name = ScannerUtils.inputString("Please input a name, please input again.");
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}