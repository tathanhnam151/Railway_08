package com.vti.frontend;

import java.util.InputMismatchException;
import com.vti.backend.Exercise5;
import com.vti.entity.question5.InvalidAgeException;

public class Program56 {
	public static void main(String[] args) {
		Exercise5 ex5 = new Exercise5();
		while (true) {
			try {
				int x = ex5.inputAge();
				System.out.println("Tuoi cua ban la: " + x);
				break;
			} catch (InputMismatchException e) {
				System.out.println("wrong inputing! Please input an age as int, input again.");
			} catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

