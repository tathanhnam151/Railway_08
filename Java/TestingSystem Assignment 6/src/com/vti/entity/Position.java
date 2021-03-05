package com.vti.entity;

import com.vti.ScannerUtils;

public class Position {
	int id;
	String name;
	
	
	// Question 9
	public void input() {
		System.out.println("Nhap id: ");
		id = ScannerUtils.inputInt("Please input a id as int, please input again.");
		System.out.println("Nhap ten; ");
		name = ScannerUtils.inputString("Please input a name, please input again.");
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
