package mains.part2;

import java.util.ArrayList;

import scanner.ScannerUtils;

public class Program7 {
	public static void main(String[] args) {
		int input = ScannerUtils.inputInt("Please input an int!");
		ArrayList<Integer> primes = new ArrayList<Integer>();

		int count = 0;
		int x = 2;
		while (count < input) {
			int i = 2;
			ArrayList<Integer> nums = new ArrayList<Integer>();
			int y = x;
			while (y > 1) {
				if (y % i == 0) {
					y = y / i;
					nums.add(i);
				} else
					i++;
			}
			if (nums.get(0) == x) {
				primes.add(x);
				x++;
				count++;
			}
			x++;
		}

		for (int num : primes) {
			System.out.println(num + " ");
		}
	}
}
