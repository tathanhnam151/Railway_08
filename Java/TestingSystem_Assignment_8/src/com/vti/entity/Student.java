package com.vti.entity;

public class Student {
	private int id;
	private String name;
	private static int count = 0;
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public Student(String name) {
		count++;
		this.id = count;
		
		this.name = name;
	}
	@Override
	public String toString() {
		return "[id: " + id + " --- name: " + name + "]";
	}
	
	
	
	
}
