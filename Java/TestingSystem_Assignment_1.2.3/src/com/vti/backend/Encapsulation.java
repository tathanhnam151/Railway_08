package com.vti.backend;

import com.vti.entity.Circle;
import com.vti.entity.Student;

public class Encapsulation {

	public void question1() {
		Student student = new Student("Nam", "hanoi");
		student.setScore(8);

		student.plusScore(1);

		System.out.println(student);
	}

	public void question2Circle() {
		Circle circle = new Circle(1.0, "red");

		System.out.println(circle);
	}
}
