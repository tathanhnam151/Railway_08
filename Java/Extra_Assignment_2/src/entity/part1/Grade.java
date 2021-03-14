package entity.part1;

import scanner.ScannerUtils;

public class Grade {
	
	private double diemToan;
	private double diemLy;
	private double diemHoa;

	private double diemXet;
	private double diemTrungBinh;
	
	private boolean xong = false;
	
	
	public double getDiemToan() {
		return diemToan;
	}

	public double getDiemLy() {
		return diemLy;
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public double getDiemXet() {
		return diemXet;
	}

	
	
	public void setDiemToan() {
		this.diemToan = ScannerUtils.inputDoubleInRange(0, 10, "Diem phai la tu 0 - 10");
	}

	public void setDiemLy() {
		this.diemLy = ScannerUtils.inputDoubleInRange(0, 10, "Diem phai la tu 0 - 10");
	}

	public void setDiemHoa() {
		this.diemHoa = ScannerUtils.inputDoubleInRange(0, 10, "Diem phai la tu 0 - 10");
	}

	public boolean isXong() {
		return xong;
	}

	public void setXong(boolean xong) {
		this.xong = xong;
	}

	public void setDiemXet(double diemXet) {
		this.diemXet = ((diemToan * 2) + diemLy + diemHoa) / 4;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;
	}

	
	
	
}
