package com.vti.entity.inheritance;

import java.util.Scanner;

public class CanBo {

	private String hoTen;
	private byte tuoi;
	private String gioiTinh;
	private String diaChi;

	public CanBo() {
	}

	

	public CanBo(String hoTen, byte tuoi, String gioiTinh, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}



	public String getHoTen() {
		return hoTen;
	}

	public Byte getTuoi() {
		return tuoi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	private void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiachi() {
		return diaChi;
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ho va ten: ");
		hoTen = scanner.nextLine();

		System.out.println("Tuoi: ");
		tuoi = scanner.nextByte();

		System.out.println("Gioi tinh: ");
		setGioiTinh(scanner.nextLine());

		System.out.println("Dia chi: ");
		diaChi = scanner.nextLine();
		
	}

	public void getInfo() {
		System.out.println("Ho va ten: " + hoTen);
		System.out.println("Tuoi: " + tuoi);
		System.out.println("Gioi tinh: " + gioiTinh);
		System.out.println("Dia chi: " + diaChi);
	}

}
