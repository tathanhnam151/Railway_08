package mains;

import entity.part1.Question3;
import scanner.ScannerUtils;

public class Program3 {
	public static void main(String[] args) {
		int x = 0;
		int x1;
		int x2;
		int x3;
		int x4;
		
		while (x != 2) {
			System.out.println("Nhap 1 de bat dau, nhap 2 de ket thuc");
			x = ScannerUtils.inputInRange(1, 2, "Not in range, please input again");
			switch (x) {
			case 1:
			System.out.println("Nhap so thu nhat:");
			x1 = ScannerUtils.inputInt("Please input an int");
			System.out.println("Nhap so thu hai:");
			x2 = ScannerUtils.inputInt("Please input an int");
			System.out.println("Nhap so thu ba:");
			x3 = ScannerUtils.inputInt("Please input an int");
			System.out.println("Nhap so thu tu:");
			x4 = ScannerUtils.inputInt("Please input an int");
			
			
			Question3.maxmin(x1, x2, x3, x4);
			System.out.println("\n");
			break;
			case 2:
				break;
				default:
			}
		
		}
	}
}
