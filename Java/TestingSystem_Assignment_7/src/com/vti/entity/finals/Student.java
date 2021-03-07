package com.vti.entity.finals;

public class Student {
	private final int id;
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;

	}
	
	public final void study() {
		System.out.println("Dang hoc bai ...");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
