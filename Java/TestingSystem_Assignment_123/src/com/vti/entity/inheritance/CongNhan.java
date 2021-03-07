package com.vti.entity.inheritance;

import java.util.Scanner;

public class CongNhan extends CanBo {

	private byte bac;

	public byte getBac() {
		return bac;
	}
	
	public void setBac(byte bac) {
		this.bac = bac;
	}

	@Override
	public void input() {
		super.input();

		Scanner scanner1 = new Scanner(System.in);

		System.out.println("Nhap bac cua cong nhan: ");
		bac = scanner1.nextByte();
	}

	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Bac cong nhan: " + bac);
	}

}