package mains;

import entity.part1.Question4;
import scanner.ScannerUtils;

public class Program4 {
	public static void main(String[] args) {
		int x = 0;
		while (x != 2) {
			System.out.println("Bam 1 de tiep tuc, bam 2 de thoat.");
			x = ScannerUtils.inputInRange(1, 2, "So da nhap khong hop le, vui long nhap lai!");
			switch (x) {
			case 1:
				System.out.println("Nhap so thu nhat:");
				int x1 = ScannerUtils.inputInt("Please input an int!");
				System.out.println("Nhap so thu hai:");
				int x2 = ScannerUtils.inputInt("Please input an int!");
				Question4.subtract(x1, x2);
				break;
			case 2:
				break;
			default:
			}
		}
	}
}
