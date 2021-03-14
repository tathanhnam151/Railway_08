package com.vti.entity.generic;

public class Student<T> {
	private T id;
	private String name;
	
	public Student(T id, String name) {
		this.id = id;
		this.name = name;		
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void addStudent() {
		Student<Integer> student1 = new Student<Integer>(1, "Nam"); 
		Student<Float> student2 = new Student<Float>(2.0f, "Huy");
		Student<Double> student3 = new Student<Double>(3.0, "Yasuo");
	
		student1.doSomething();
		student2.doSomething();
		student3.doSomething();
		
		student3.print(name);
		
	}

	private void doSomething() {
		// TODO Auto-generated method stub
		
	}
	
	<T> void print(T a) {
		System.out.println(a);
	}
	
	
}
