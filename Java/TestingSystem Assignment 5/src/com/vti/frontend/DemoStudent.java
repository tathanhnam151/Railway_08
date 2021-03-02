package com.vti.frontend;

import com.vti.backend.MyStudent;

public class DemoStudent {

	public static void main(String[] args) {
		MyStudent mystudent = new MyStudent();

		mystudent.initStudents();
		mystudent.caLopDiemDanh();
		mystudent.nhomDiHocBai();
		mystudent.nhomDiDonVeSinh();

	}
}