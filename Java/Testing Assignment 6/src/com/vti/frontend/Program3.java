package com.vti.frontend;

public class Program3 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3};
		try {
		System.out.println(numbers[10]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("so khong ton tai");
		}
	}
}
