package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.Inheritance;

public class Inheritance1 {
	public static void main(String[] args) {
		question1_2();
	}

	private static void menuQuesion1_2() {
		System.out.println("=======MENU==========");
		System.out.println("==  1. Them can bo ==");
		System.out.println("==  2. Tim can bo ==");
		System.out.println("==  3. Thong tin can bo  ==");
		System.out.println("==  4. Xoa can bo  ==");
		System.out.println("==  0. Thoat      ==");
		System.out.println("=====================");
	}

	public static void question1_2() {
		Inheritance qlcb = new Inheritance();

		byte choose;
		do {
			Scanner scanner = new Scanner(System.in);
			menuQuesion1_2();
			choose = scanner.nextByte();

			switch (choose) {
			case 1:
				qlcb.addCanBo();
				break;
			case 2:
				qlcb.printInforCanBo();
				break;
			case 3:
				qlcb.findCanBo();
				break;
			case 4:
				qlcb.deleteCanBo();
				break;
			case 0:
				break;
			default:
				System.out.println("Nhap sai, vui long nhap lai");
				break;
			}
		} while (choose != 0);

	}

}
