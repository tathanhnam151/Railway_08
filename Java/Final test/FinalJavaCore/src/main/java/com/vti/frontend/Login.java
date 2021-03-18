package com.vti.frontend;

import com.vti.backend.controller.CandidateController;
import com.vti.utils.ScannerUtils;

public class Login {
	public static void main(String[] args) throws Exception {
		
		CandidateController cc = new CandidateController();
		
//		Register.main(args);
		System.out.println("Moi ban nhap email:");
		String email = ScannerUtils.inputString("Vui long nhap mot String!");
		System.out.println("Moi ban nhap password:");
		String password = ScannerUtils.inputString("Vui long nhap mot String!");
		if (cc.loginInfoIsValidExp(email, password)) {
			System.out.println("Log in successful!");
		} else {
			System.out.println("Log in failed!");
		}
		
	}
}
