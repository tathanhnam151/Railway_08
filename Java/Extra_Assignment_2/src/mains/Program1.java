package mains;


import entity.part1.Question1;
import scanner.ScannerUtils;

public class Program1 {
	public static void main(String[] args) {
		int x = 0;
		while (x != 2) {
			System.out.println("Bam 1 de doi cm sang inch va foot, Bam 2 de thoat.");
			
			x = ScannerUtils.inputInt("Ban can nhap mot int");
			while (true) {
				switch (x) {
				case 1:
					Program1.cmConvert();
					break;

				case 2:
					break;
				default:
				}
				break;

			}
		}

	}

	public static void cmConvert() {
		double input;
		System.out.println("Nhap so can doi");
		input = ScannerUtils.inputDouble("Input must be a double");
		Question1.convert(input);
	}
}
