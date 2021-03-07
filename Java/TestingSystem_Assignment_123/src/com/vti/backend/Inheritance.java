package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.inheritance.CanBo;
import com.vti.entity.inheritance.CongNhan;
import com.vti.entity.inheritance.KySu;
import com.vti.entity.inheritance.NhanVien;

public class Inheritance {
	private ArrayList<CanBo> listCanBo;

	public Inheritance() {
		listCanBo = new ArrayList<>();
	}

	// a) Them can bo.
	public void addCanBo() {
		
		int n;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap so can bo ban muon them:  ");
		n = scanner.nextInt();

		byte choose;
		CanBo canBo = new CanBo();
		for (int i = 0; i < n; i++) {
			System.out.println("Ban muon nhap loai can bo nao? 1: Cong nhan; 2: Ky su; 3: Nhan vien) ");
			choose = scanner.nextByte();

			switch (choose) {
			case 1:
				canBo = new CongNhan();
				break;
			case 2:
				canBo = new KySu();
				break;
			case 3:
				canBo = new NhanVien();
				break;
			default:
				System.out.println("Khong hop le!");
				i--;
				break;
			}

			canBo.input();
			listCanBo.add(canBo);

			scanner.close();
		}
	}

	// b) Tim can bo
	public void findCanBo() {
		
		Scanner scanner = new Scanner(System.in);

		String hoTen;
		System.out.println("Nhap ho ten can tim: ");
		hoTen = scanner.nextLine();

		for (CanBo canBo : listCanBo) {
			if (hoTen.equals(canBo.getHoTen())) {
				canBo.getInfo();
			}
		}
	}

	// c) Hien thi thong tin cua can bo.
	public void printInforCanBo() {
		
		for (CanBo canBo : listCanBo) {
			canBo.getInfo();
		}
	}

	// d) Xoa can bo
	public void deleteCanBo() {
		
		Scanner scanner = new Scanner(System.in);

		String hoTen;
		System.out.println("Nhap ten can bo can xoa: ");
		hoTen = scanner.nextLine();

		listCanBo.removeIf(cb -> hoTen.equals(cb.getHoTen()));
	}
}
