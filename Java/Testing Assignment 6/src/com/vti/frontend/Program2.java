package com.vti.frontend;

public class Program2 {
	public static void main(String[] args) {
		try {
			float result = divide(7, 0);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("cannot divide 0");
		} finally {
			System.out.println("divide completed");
		}
	}

	private static float divide(int a, int b) {
		return a / b;
	}
}
