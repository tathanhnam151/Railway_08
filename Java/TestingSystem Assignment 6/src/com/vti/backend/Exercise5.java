package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.question5.InvalidAgeException;

public class Exercise5 {
	public int inputAge() throws InvalidAgeException {
		System.out.println("Nhap tuoi cua ban: ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input < 0) {
			throw new InvalidAgeException("Wrong inputing! The age must be greater than 0, please input again.");
		} else {
			return input;	
		}
	}
}
