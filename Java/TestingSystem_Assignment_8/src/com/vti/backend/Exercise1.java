package com.vti.backend;

import java.util.ArrayList;
import java.util.Collections;

import com.vti.entity.Student;

public class Exercise1 {
	public ArrayList<Student> students = new ArrayList<Student>();

	public void addStudent() {
		students.add(new Student("Nguyen Van A"));
		students.add(new Student("Nguyen Van B"));
		students.add(new Student("Nguyen Van C"));
		students.add(new Student("Nguyen Van D"));
		students.add(new Student("Nguyen Van E"));
		students.add(new Student("Nguyen Van F"));
		students.add(new Student("Nguyen Van G"));

	}

	public void inStudent() {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public void caua() {
		addStudent();
		System.out.println("So phan tu cua students: " + students.size());
	}

	public void caub() {
		addStudent();
		System.out.println("Phan tu thu tu: " + students.get(3));
	}

	public void cauc() {
		addStudent();
		System.out.println("Phan tu dau: " + students.get(0));
		System.out.println("Phan tu cuoi: " + students.get(students.size() - 1));
	}

	public void caud() {
		addStudent();
		students.add(0, new Student("Nguyen Van Z"));
	}

	public void caue() {
		addStudent();
		students.add(students.size() - 1, new Student("Nguyen Van Y"));
	}

	public void cauf() {
		addStudent();
		Collections.reverse(students);
	}

	public void caug(int input) {
		boolean timThay = false;
		for (Student student : students) {
			if (student.getId() == input) {
				System.out.println("Tim thay: " + student.toString());
				timThay = true;
			}

		}
		if (timThay == false) {
			System.out.println("Khong tim thay ket qua voi id = " + input);
		}

	}
}
