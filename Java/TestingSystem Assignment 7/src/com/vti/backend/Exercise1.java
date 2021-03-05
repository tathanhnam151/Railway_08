package com.vti.backend;

import java.util.ArrayList;

import com.vti.entity.PrimaryStudent;
import com.vti.entity.SecondaryStudent;
import com.vti.entity.Student;
import com.vti.scanner.ScannerUtils;

public class Exercise1 {
	private ArrayList<Student> students = new ArrayList<Student>();

	public void themHocSinh() {
		Student student1 = new Student(1, "Nguyen Van A");
		Student student2 = new Student(2, "Nguyen Van B");
		Student student3 = new Student(3, "Nguyen Van C");
		students.add(student1);
		students.add(student2);
		students.add(student3);
	}

	public void thongTin1() {
		Student.setCollege("Dai hoc Bach Khoa");
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

	public void thongTin2() {
		Student.setCollege("Dai hoc cong nghe");
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

	// Question 5
	public void demStudent() {
		int soHocSinh = students.size();
		System.out.println("So hoc sinh la: " + soHocSinh);
	}

	// Question 6
	public void themHocSinh5() {
		PrimaryStudent pstudent1 = new PrimaryStudent();
		PrimaryStudent pstudent2 = new PrimaryStudent();
		SecondaryStudent sstudent1 = new SecondaryStudent();
		SecondaryStudent sstudent2 = new SecondaryStudent();
		SecondaryStudent sstudent3 = new SecondaryStudent();
		SecondaryStudent sstudent4 = new SecondaryStudent();

		students.add(sstudent4);
		students.add(sstudent3);
		students.add(sstudent2);
		students.add(sstudent1);
		students.add(pstudent1);
		students.add(pstudent2);
	}

	public void demHocSinh5() {
		int pcount = 0;
		int scount = 0;

		for (Student student : students) {
			if (student.getKhoi() == "Primary") {
				pcount += 1;
			} else
				scount += 1;
		}
		System.out.println("So hoc sinh tieu hoc la: " + pcount);
		System.out.println("So hoc sinh trung hoc la: " + scount);
	}

	// Question 7
	public void addHocSinh() {
		while (students.size() < 7) {
			System.out.println("Ban muon them hoc sinh cap may? (1: Primary; 2: Secondary; 3: Thoat chuong trinh)");
			int input = ScannerUtils.inputInt("Ban can nhap mot int!");
			switch (input) {
			case 1:
				PrimaryStudent pstudent = new PrimaryStudent();
				pstudent.input();
				students.add(pstudent);
				break;
			case 2:
				SecondaryStudent sstudent = new SecondaryStudent();
				sstudent.input();
				students.add(sstudent);
			case 3:
				break;
			}
			if (input == 3) {
				break;
			}
		}
		if (students.size() == 7) {
			System.out.println("Maximum capacity reached!");
		}
	}
}
