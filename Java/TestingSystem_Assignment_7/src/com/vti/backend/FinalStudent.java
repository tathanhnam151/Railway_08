package com.vti.backend;

import com.vti.entity.finals.Student;
import com.vti.scanner.ScannerUtils;

public class FinalStudent {
	public void createStudent() {
		System.out.println("Moi ban nhap vao thong tin id: ");
		int id = ScannerUtils.inputInt("Invalid input, please try again.");
		System.out.println("Moi ban nhap vao thong tin ten: ");
		String name = ScannerUtils.inputString("Invalid input, please try again");
		
		Student st = new Student(id, name);
		System.out.println(st);
	}
}
