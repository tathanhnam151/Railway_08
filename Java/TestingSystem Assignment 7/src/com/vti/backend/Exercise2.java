package com.vti.backend;

import java.util.ArrayList;

import com.vti.entity.Student;

public class Exercise2 {
	private ArrayList<Student> students = new ArrayList<Student>(); 
	
	public void themHocSinh() {
		Student student1 = new Student(1, "Nguyen Van A");
		Student student2 = new Student(2, "Nguyen Van B");
		Student student3 = new Student(3, "Nguyen Van C");
		students.add(student1);
		students.add(student2);
		students.add(student3);
		Student.setMoneyGroup(0);
	}
	
	public void buoc1() {
		for (Student student : students) {
			student.nopQuy(100);
		}
		Student.tienConLai();
	}
	
	public void buoc2() {
		students.get(0).tieuQuy(50, "mua bim bim");
		Student.tienConLai();
	}
	
	public void buoc3() {
		students.get(1).tieuQuy(20, "mua banh mi");
		Student.tienConLai();
	}
	
	public void buoc4() {
		students.get(2).tieuQuy(150, "mua do dung hoc tap cho nhom");
		Student.tienConLai();
	}	
	
	public void buoc5() {
		for (Student student : students) {
			student.nopQuy(50);
		}
		Student.tienConLai();
	}
	
}
