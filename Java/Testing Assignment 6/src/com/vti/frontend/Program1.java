package com.vti.frontend;

public class Program1 {
	public static void main(String[] args) {
		try {
			float result = divide(7, 0);
			System.out.println(result);
		}
		catch (ArithmeticException e){
			System.out.println("cannot divide 0");
		}
		
	}

	private static float divide(int a, int b) {
			return a/b;
	}
}
