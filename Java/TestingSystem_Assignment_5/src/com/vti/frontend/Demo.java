package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.MyNews;

public class Demo {
	public static void main(String[] args) {
		Chay();
	}
	
	private static void menune() {
		System.out.println("Menu");
		System.out.println("Moi ban chon chuc nang");
		System.out.println("1: Insert news");
		System.out.println("2: View list news");
		System.out.println("3: Average rates");
		System.out.println("0: Exit");
	}
	
	public static void Chay() { 
		MyNews mynews = new MyNews();
		byte choose;
		
		do {
			Scanner scanner = new Scanner(System.in);
			menune();
			choose = scanner.nextByte();
			
			switch(choose) {
			case 1:
				mynews.InsertNews();
				break;
			case 2:
				mynews.showListNews();
				break;
			case 3:
				mynews.AverageRates();
				break;
			case 0:
				break;
			}
		} while (choose != 0);
	}
}
