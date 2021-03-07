package com.vti.entity;

import com.vti.scanner.ScannerUtils;

public class Student {
	protected static String college;
	protected static int moneyGroup = 0;
	protected int id;
	protected String name;
	protected String khoi;

	public String getKhoi() {
		return khoi;
	}

	public Student() {
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}

	public static int getMoneyGroup() {
		return moneyGroup;
	}

	public static void setMoneyGroup(int moneyGroup) {
		Student.moneyGroup = moneyGroup;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public final void study() {
		System.out.println("Dang hoc bai ...");
	}

	
	public void nopQuy(int soTien) {
		moneyGroup += soTien;
		System.out.println(this.name + " da nop quy: " + soTien + "k");
	}

	public void tieuQuy(int soTien, String lyDo) {
		moneyGroup -= soTien;
		System.out.println(this.name + " da tieu quy: " + soTien + "k" + "\n" + "Ly do dung tien: " + lyDo);
	}

	public void input() {
		System.out.println("Moi ban nhap id hoc sinh:");
		this.id = ScannerUtils.inputInt("Id phai la mot int, vui long nhap lai");
		System.out.println("Moi ban nhap ho ten hoc sinh");
		this.name = ScannerUtils.inputString("Ten phai la mot String, vui long nhap lai");
	}

	public static void tienConLai() {
		System.out.println("So tien con lai trong quy: " + Student.getMoneyGroup() + "k");
	}

	@Override
	public String toString() {
		return "Student [id = " + id + ", name = " + name + ", truong = " + college + "]";
	}

}
