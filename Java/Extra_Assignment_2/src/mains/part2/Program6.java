package mains.part2;

import java.util.ArrayList;

import scanner.ScannerUtils;

public class Program6 {
	public static void main(String[] args) {
		int input = ScannerUtils.inputInt("Please input an int!");
		ArrayList<Integer> primes = new ArrayList<Integer>();
	
		for (int x = 2; x < input; x++) {
			int i = 2;
			ArrayList<Integer> nums = new ArrayList<Integer>();
			int y = x;
			while (y > 1) {
				if (y % i == 0) {
					y = y/i;
					nums.add(i);
				} else i++;
			}
			if (nums.get(0) == x) {
				primes.add(x);
			}
		}
		for (int num : primes) {
			System.out.println(num + " ");
		}
	}
}
