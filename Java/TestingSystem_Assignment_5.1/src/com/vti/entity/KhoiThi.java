package com.vti.entity;

import java.util.Arrays;

public class KhoiThi {
	private String tenKhoi;
	private String[] monHoc;
	
	
	
	public KhoiThi(String tenKhoi ,String mon1, String mon2, String mon3) {
		this.tenKhoi = tenKhoi;
		String[] cacMon = {mon1, mon2, mon3};
		this.setMonHoc(cacMon);
	}
	public String getTenKhoi() {
		return tenKhoi;
	}
	public void setTenKhoi(String tenKhoi) {
		this.tenKhoi = tenKhoi;
	}
	public String[] getMonHoc() {
		return monHoc;
	}
	public void setMonHoc(String[] monHoc) {
		this.monHoc = monHoc;
	}
	
	
	@Override
	public String toString() {
		return "KhoiThi [tenKhoi=" + tenKhoi + ", monHoc=" + Arrays.toString(monHoc) + "]";
	}

	
	

}
