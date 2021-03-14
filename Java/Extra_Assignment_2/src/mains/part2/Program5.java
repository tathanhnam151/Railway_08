package mains.part2;

import java.util.ArrayList;

import scanner.ScannerUtils;

public class Program5 {
	public static void main(String[] args) {
		int n = ScannerUtils.inputInt("Please input an int!");
		int i = 2;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		while (n > 1) {
			if (n % i == 0) {
				n = n/i;
				nums.add(i);
			} else i++;
		}
		System.out.print("n=");
		for (int x = 0; x < nums.size() - 1; x++) {
			System.out.print(nums.get(x) + "x");
		}
		
		System.out.print(nums.get(nums.size() - 1));
	}
}
