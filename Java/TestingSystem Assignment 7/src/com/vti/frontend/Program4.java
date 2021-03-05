package com.vti.frontend;

import com.vti.entity.Student;

public class Program4 {
	public static void main(String[] args) {
		Student.setCollege("Truong dai hoc Bach Khoa");
		String tenTruong = Student.getCollege();
		System.out.println(tenTruong);
	}
}
