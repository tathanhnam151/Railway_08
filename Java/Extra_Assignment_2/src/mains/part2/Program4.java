package mains.part2;

import entity.part2.Exercise4;
import scanner.ScannerUtils;

public class Program4 {
	public static void main(String[] args) {
		Exercise4 ex = new Exercise4();
		System.out.println("Moi ban nhap mot so: ");
		int input = ScannerUtils.inputInt("Please input an int");
		ex.sumDigit(input);
	}
}
