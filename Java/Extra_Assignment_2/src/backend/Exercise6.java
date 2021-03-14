package backend;

import entity.part1.Grade;

public class Exercise6 {
	Grade diem = new Grade();

	public void nhapDiem() {
		System.out.println("Moi ban nhap vao diem Toan:");
		diem.setDiemToan();
		System.out.println("Moi ban nahp vao diem Ly:");
		diem.setDiemLy();
		System.out.println("Moi ban nhap vao diem Hoa:");
		diem.setDiemHoa();
		System.out.println("Nhap diem thanh cong!");
		diem.setXong(true);
	}

	public void tinhTB() {
		if (diem.isXong() == false) {
			System.out.println("Ban chua nhap diem cho hoc sinh!");
			nhapDiem();
		} else
			diem.getDiemTrungBinh();
		System.out.println("Diem trung binh cua hoc sinh la:" + diem.getDiemTrungBinh() + ".");
	}

	public void xacDinhHL() {
		if (diem.isXong() == false) {
			System.out.println("Ban chua nhap diem cho hoc sinh!");
			nhapDiem();
		} else {
			double diemXet = diem.getDiemXet();
			if (diemXet >= 9.0) {
				System.out.println("Hoc sinh dat loai xuat sac!");
			} else if (diemXet >= 8.0) {
				System.out.println("Hoc sinh dat loai gioi!");
			} else if (diemXet >= 7.0) {
				System.out.println("Hoc sinh dat loai kha!");
			} else if (diemXet >= 6.0) {
				System.out.println("Hoc sinh dat loai trung binh kha!");
			} else if (diemXet >= 5.0) {
				System.out.println("Hoc sinh dat loai trunng binh!");
			} else {
				System.out.println("Hoc sinh dat loai kem!");
			}
		}
	}
}
