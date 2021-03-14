package com.vti.entity.inheritance;

import java.util.Scanner;

public class NhanVien extends CanBo {

	private String congViec;

	public String getCongViec() {
		return congViec;
	}

	@Override
	public void input() {
		super.input();

		Scanner scanner1 = new Scanner(System.in);

		System.out.println("Nhap cong viec: ");
		congViec = scanner1.nextLine();
	}

	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Cong viec: " + getCongViec());
	}

}
