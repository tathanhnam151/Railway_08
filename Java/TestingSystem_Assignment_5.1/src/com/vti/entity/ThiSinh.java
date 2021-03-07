package com.vti.entity;

import com.vti.scanner.ScannerUtils;

public class ThiSinh {

	private int sbd;
	private String hoTen;
	private String diaChi;
	private String mucUuTien;
	private KhoiThi khoiThi;

	public ThiSinh() {

	}

	public ThiSinh(int sbd, String hoTen, KhoiThi khoiThi) {
		this.sbd = sbd;
		this.hoTen = hoTen;
		this.khoiThi = khoiThi;
	}

	public void input() {
		System.out.println("Moi ban nhap vao sbd thi sinh!");
		this.sbd = ScannerUtils.inputInt("Sbd phai la mot int");
		System.out.println("Moi ban nhap vao ho va ten thi sinh!");
		this.hoTen = ScannerUtils.inputString("Ho va ten phai la mot String");
	}
	
	public int getSbd() {
		return sbd;
	}

	public void setSbd(int sbd) {
		this.sbd = sbd;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getMucUuTien() {
		return mucUuTien;
	}

	public void setMucUuTien(String mucUuTien) {
		this.mucUuTien = mucUuTien;
	}

	public KhoiThi getKhoiThi() {
		return khoiThi;
	}

	public void setKhoiThi(KhoiThi khoiThi) {
		this.khoiThi = khoiThi;
	}

	@Override
	public String toString() {
		return "ThiSinh [sbd=" + sbd + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", mucUuTien=" + mucUuTien
				+ ", khoiThi=" + khoiThi + "]";
		
		}

	public String toString1() {
		return "ThiSinh [sbd=" + sbd + ", hoTen=" + hoTen + ", khoiThi=" + khoiThi.getTenKhoi() + "]";
	}
	
	
}
