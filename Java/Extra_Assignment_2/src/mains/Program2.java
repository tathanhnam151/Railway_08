package mains;

import entity.part1.Question2;
import scanner.ScannerUtils;

public class Program2 {
	public static void main(String[] args) {
		int x = 0;

		while (x != 2) {
			System.out.println("Bam 1 de chuyen doi giay, bam 2 de thoat chuong trinh.");
			x = ScannerUtils.inputInRange(1, 2, "Not in range, please input again.");
			switch (x) {
			case 1:
				System.out.println("Nhap so giay muon quy doi: ");
				int input = ScannerUtils.inputInRange(0, 68399, "Not in range, please input again.");
				Question2.conversion(input);
				break;

			case 2:
				break;
			default:
			}
		}
	}
}
