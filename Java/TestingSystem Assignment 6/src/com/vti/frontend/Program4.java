package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.Exercise4;

public class Program4 {
	public static void main(String[] args) {
		Exercise4 ex4 = new Exercise4();
		ex4.addDepartments();
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Index = ?");
			int index = scanner.nextInt();
			try {
				ex4.getIndex(index);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Cannot find department");
			}
		}
	}
}