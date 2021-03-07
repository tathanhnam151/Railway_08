package com.vti.entity;

public class MyMath {
	private final double PI = 3.14; 
	
	public static int max(int a, int b) {
		if (a > b) {
			return a;
		} else return b;
	}
	
	public double sum(int a) {
		return a + PI;
	}

//	public void changePI() {
//		PI = 3.15;
//	}

}
