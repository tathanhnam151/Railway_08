package com.vti.frontend;

import com.vti.backend.Exercise1;
import com.vti.utils.ScannerUtils;

public class Program1 {
	public static void main(String[] args) {
		Exercise1 ex = new Exercise1();
		ex.addStudent();
		System.out.println("Moi ban nhap vao id hoc sinh can tim:");
		int input = ScannerUtils.inputInt("Please input an int!");
		ex.caug(input);
		
	}

}
