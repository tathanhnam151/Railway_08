package com.vti.entity;

public class Student {
	private int id;
	private String name;
	private static int count = 0;
	
	/**
	 * @deprecated replaced by {@link #getIdV2()}
	 */
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		count++;
	}
	public static int getCount() {
		return count;
	}
	
	public String getIdV2() {
		return "MSV: " + id;		
	}

	
	
	
	
}
