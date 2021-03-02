package com.vti.entity;

public class Student implements IStudent {

	private int id;
	private String name;
	private int group;

	public Student(int id, String name, int group) {
		this.id = id;
		this.name = name;
		this.group = group;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGroup() {
		return group;
	}

	@Override
	public void diemDanh() {
		System.out.println(name + " diem danh");
	}

	@Override
	public void hocBai() {
		System.out.println(name + " dang hoc bai");
	}

	@Override
	public void diDonVeSinh() {
		System.out.println(name + " dang di don ve sinh");
	}
}

