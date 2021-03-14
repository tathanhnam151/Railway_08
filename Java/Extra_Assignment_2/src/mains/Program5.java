package mains;

import entity.part1.Question5;
import scanner.ScannerUtils;

public class Program5 {
	public static void main(String[] args) {
		int x = 0;
		while (x != 2) {
			System.out.println("Bam 1 de tiep tuc, bam 2 de thoat.");
			x = ScannerUtils.inputInRange(1, 2, "So da nhap khong hop le, vui long nhap lai!");
			switch (x) {
			case 1:
				System.out.println("Moi ban nhap so bi chia: ");
				int a = ScannerUtils.inputInt("Pleas input an int!");
				System.out.println("Moi ban nhap so chia:");
				int b = ScannerUtils.inputInt("Please input an int");
				Question5.chiaHet(a, b);
				break;
			case 2:
				break;
			default:
			}
		}			
	}
}
