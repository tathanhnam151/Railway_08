package com.vti.frontend;

import com.vti.backend.Exercise;
import com.vti.scanner.ScannerUtils;

public class Program {
	public static void main(String[] args) {
		run();
	}

	public static void menu() {
		System.out.println("BO GIAO DUC VA DAO TAO HA NOI" + "\n");

		System.out.println("Moi ban chon chuc nang:");
		System.out.println("1. Them thi sinh.");
		System.out.println("2. Hien thi thong tin thi sinh va khoi thi.");
		System.out.println("3. Tim kiem thi sinh theo so bao danh.");
		System.out.println("4. Thoat chuong trinh");
	}

	public static void run() {
		Exercise ex = new Exercise();
		int x = 0;

		while (x != 4) {

			menu();
			x = ScannerUtils.inputInt("Ban phai nhap mot so");

			switch (x) {
			case 1:
				ex.addThiSinh();
				break;
			case 2:
				ex.listThiSinhVaKhoiThi();
				break;
			case 3:
				ex.timKiemThiSinh();
				break;
			case 4:
				System.out.println("Cam on ban da su dung chuong trinh!");
				continue;
			}

		}
	}
}
