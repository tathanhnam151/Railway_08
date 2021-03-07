package com.vti.backend;

import java.util.ArrayList;
import com.vti.entity.KhoiThi;
import com.vti.entity.ThiSinh;
import com.vti.scanner.ScannerUtils;

public class Exercise {

	private KhoiThi khoiA = new KhoiThi("A", "Toan", "Ly", "Hoa");
	private KhoiThi khoiB = new KhoiThi("B", "Toan", "Hoa", "Sinh");
	private KhoiThi khoiC = new KhoiThi("C", "Van", "Su", "Dia");
	private ArrayList<KhoiThi> listKhoiThi = new ArrayList<KhoiThi>();
	private ArrayList<ThiSinh> listThiSinh = new ArrayList<ThiSinh>();

	public void initKhoiThi() {
		listKhoiThi.add(khoiA);
		listKhoiThi.add(khoiB);
		listKhoiThi.add(khoiC);
	}

	// method add thi sinh
	public void addThiSinh() {

		ThiSinh thisinh = new ThiSinh();
		thisinh.input();
		int x = 0;
		while ((x != 1) && (x != 2) && (x != 3)) {
			System.out.println("Moi ban nhap khoi thi cua thi sinh! Khoi A: 1, Khoi B: 2, Khoi C: 3");
			x = ScannerUtils.inputInt("Input phai la mot Int");
			if (x == 1) {
				thisinh.setKhoiThi(khoiA);
			} else if (x == 2) {
				thisinh.setKhoiThi(khoiB);
			} else if (x == 3) {
				thisinh.setKhoiThi(khoiC);
			} else
				System.out.println("So can nhap phai la 1; 2; hoac 3");
			break;
		}
		listThiSinh.add(thisinh);
		System.out.println("Them thi sinh thanh cong");
		System.out.println("----------------------------------");

	}

	
	//  method hien thi thi sinh va khoi thi
	public void listThiSinhVaKhoiThi() {
		System.out.println("Thong tin thi sinh:");
		for (ThiSinh thisinh : listThiSinh) {
			System.out.println(thisinh.toString1());
		}
		System.out.println("\n");
		System.out.println("Thong tin khoi thi:");
		for (KhoiThi khoithi : listKhoiThi) {
			System.out.println(khoithi.toString());
		}
		System.out.println("----------------------------------");
	}
	
	
	// method tim kiem thi sinh theo so bao danh
	public void timKiemThiSinh() {
		System.out.println("Nhap sbd thi sinh ban muon tim:");
		int input = ScannerUtils.inputInt("Sbd phai la mot int!");
		boolean coThiSinh = false;
		for (ThiSinh thisinh : listThiSinh) {
			if (thisinh.getSbd() == input) {
				System.out.println(thisinh.toString1());
				coThiSinh = true;
			}
		}
		if (coThiSinh = false) {
			System.out.println("Khoi tim thay thi sinh voi so bao danh: " + input);
		}
	}
}
