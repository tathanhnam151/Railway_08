package com.vti.backend;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import com.vti.entity.Student;

public class Exercise2 {
	public void thuTu1() {
		Stack<Student> students = new Stack<Student>();
		students.push(new Student("Nguyen Van Nam"));
		students.push(new Student("Nguyen Van Huyen"));
		students.push(new Student("Tran Van Nam"));
		students.push(new Student("Nguyen Van A"));

		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
	}

	public void thuTu2() {
		Queue<Student> students = new ArrayDeque<>();
		students.add(new Student("Nguyen Van Nam"));
		students.add(new Student("Nguyen Van Huyen"));
		students.add(new Student("Tran Van Nam"));
		students.add(new Student("Nguyen Van A"));

		System.out.println(students.poll());
		System.out.println(students.poll());
		System.out.println(students.poll());
		System.out.println(students.poll());

	}
}
