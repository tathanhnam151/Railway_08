package com.vti.entity.inheritance;

import java.util.Scanner;

public class KySu extends CanBo {

	private String nganhDaoTao;

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	@Override
	public void input() {
		super.input();

		Scanner scanner1 = new Scanner(System.in);

		System.out.println("Nhap nganh dao tao: ");
		nganhDaoTao = scanner1.nextLine();
	}

	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Nganh dao tao: " + nganhDaoTao);
	}
}
