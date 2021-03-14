package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.inheritance.CanBo;

public class QLCB {
	
	ArrayList<CanBo> listCanBo = new ArrayList<>();
	
	// Them can bo
	public void addCanBo() {
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("Moi ban nhap ten: ");
		name = scanner.nextLine();
		byte tuoi;
		System.out.println("Moi ban nhap tuoi ");
		tuoi = scanner.nextByte();
		String diaChi;
		System.out.println("Moi ban nhap dia chi: ");
		diaChi = scanner.nextLine();
		String gioiTinh;
		System.out.println("Moi ban nhap gioi tinh: ");
		gioiTinh = scanner.nextLine();
		
		CanBo canbo = new CanBo(name, tuoi, diaChi, gioiTinh);
		listCanBo.add(canbo);		
	}
	
	// Hien thi danh sach can bo
	public void showListCanBo() {
		for (CanBo canbo : listCanBo) {
			System.out.println(canbo.toString());
		}
	}
	
	// Tim can bo
	public void findCanBo() {
		Scanner scanner = new Scanner(System.in);
		String tenCanBo;
		System.out.println("Moi ban nhap ten can bo");
		tenCanBo = scanner.nextLine();
		for (CanBo canbo : listCanBo) {
			if (canbo.getHoTen().equals(tenCanBo)) {
				canbo.getInfo();
			}
		}
	}
	
	// Xoa can bo
	public void xoaCanBo() {
		Scanner scanner = new Scanner(System.in);
		String tenCanBo;
		System.out.println("Moi ban nhap ten can bo can xoa");
		tenCanBo = scanner.nextLine();
		for (CanBo canbo : listCanBo) {
			if (canbo.getHoTen().equals(tenCanBo)) {
				int x = listCanBo.indexOf(canbo);
				listCanBo.remove(x);
			}
		}
	}
	
}


//public void addCanBo(){
//	Scanner scanner = new Scanner(System.in);
//	String name;
//	System.out.println("Mời bạn nhập tên :");		
//	name = scanner.nextLine();
//	int tuoi;
//	System.out.println("Mời bạn nhập tuoi :");		
//	tuoi = scanner.nextInt();
//	scanner.nextLine();
//	String diachi;
//	System.out.println("Mời bạn nhập diachi :");		
//	diachi = scanner.nextLine();
//	String gioitinh;
//	System.out.println("Mời bạn nhập gioitinh :");		
//	gioitinh = scanner.nextLine();
//	
//	CanBo canBo = new CanBo(tuoi,name,gioitinh,diachi);		
//	listCanBo.add(canBo);		
//}	
//public void showListCanBo() {
//	for (CanBo canBo : listCanBo) {
//		System.out.println(canBo.toString());
//	}
//}