package com.vti.frontend;

import com.vti.backend.controller.CandidateController;
import com.vti.backend.entity.ExperienceCandidate;
import com.vti.backend.entity.FresherCandidate;
import com.vti.utils.ScannerUtils;

public class Register {

	public static void main(String[] args) throws Exception {

		CandidateController cc = new CandidateController();

		System.out.println("Vui long chon role ban muon dang ky:");
		System.out.println("1: Experienced Candidate");
		System.out.println("2: Fresher Candidate");

		int x = ScannerUtils.inputInRange(1, 2, "Vui long nhap 1 hoac 2!");

		switch (x) {
		case 1:
			System.out.println("Moi ban nhap first name:");
			String firstName = ScannerUtils.inputString("Vui long nhap mot String!");
			System.out.println("Moi ban nhap last name:");
			String lastName = ScannerUtils.inputString("Vui long nhap mot String!");
			System.out.println("Moi ban nhap so dien thoai:");
			String phone = ScannerUtils.inputString("Vui long nhap mot String!");
			System.out.println("Moi ban nhap email:");
			String email = ScannerUtils.inputString("Vui long nhap mot String!");
			System.out.println("Ban da co bao nhieu nam kinh nghiem?");
			int expInYear = ScannerUtils.inputInRange(0, 10, "Vui long nhap mot so giua 0 va 10!");
			System.out.println("Vui long nhap mat khau");
			String password = ScannerUtils.inputString("Vui long nhap lai!");
			cc.registerExperienceCandidate(firstName, lastName, email, phone, expInYear, password);
			if (cc.searchByEmail(email)) {
				System.out.println("Register successfully!");
				new ExperienceCandidate(firstName, lastName, email, phone, expInYear, password);
			}
			break;

		case 2:
			System.out.println("Moi ban nhap first name:");
			String firstName1 = ScannerUtils.inputString("Vui long nhap mot String");
			System.out.println("Moi ban nhap last name:");
			String lastName1 = ScannerUtils.inputString("Vui long nhap mot String");
			System.out.println("Moi ban nhap so dien thoai:");
			String phone1 = ScannerUtils.inputString("Vui long nhap mot String");
			System.out.println("Moi ban nhap email:");
			String email1 = ScannerUtils.inputString("Vui long nhap mot String");
			System.out.println("Ban tot nghiem bang loai gi?");
			String graduationRank = ScannerUtils.inputString("Vui long nhap mot String");
			System.out.println("Vui long nhap mat khau");
			String password1 = ScannerUtils.inputString("Vui long nhap lai!");
			cc.registerFresherCandidate(firstName1, lastName1, email1, phone1, graduationRank, password1);
			if (cc.searchByEmail(email1)) {
				System.out.println("Register successfully!");
				new FresherCandidate(firstName1, lastName1, email1, phone1, graduationRank, password1);
			}
			break;
		}
	}
}
