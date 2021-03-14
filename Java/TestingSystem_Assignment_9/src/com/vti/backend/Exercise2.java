package com.vti.backend;

import com.vti.entity.Student;

@SuppressWarnings("deprecation")
public class Exercise2 {
	private Student student = new Student(0, "Nguyen Van A");
	
	public void B1() {
		//Done
	}
	
	public void v2() {
		System.out.println(student.getIdV2());
	}
	
	public void v1() {
		System.out.println(student.getId());
	}
}
