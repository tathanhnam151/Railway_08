package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.News;

public class MyNews {
	
	public ArrayList<News> listNews = new ArrayList<News>();
	
	// Insert news
	public void InsertNews() {
		
		Scanner scanner = new Scanner(System.in);
		String title;
		System.out.println("Moi ban nhap Title:");
		title = scanner.nextLine();
		String publishDate;
		System.out.println("Moi ban nhap Publish Date:");
		publishDate = scanner.nextLine();
		String author;
		System.out.println("Moi ban nhap Author:");
		author = scanner.nextLine();
		String content;
		System.out.println("Moi ban nhap Content:");
		content = scanner.nextLine();
		int rates1[] = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Moi ban nhap rate thu " + (i+1) + ":");
			rates1[i] = scanner.nextInt();
		}
		
		System.out.println("\n" + "Nhap news thanh cong!" + "\n");
		
		News news = new News(title, publishDate, author, content);
		news.setRates(rates1);
		listNews.add(news);
	}
	
	// View list news
	public void showListNews() {
		for (News news : listNews) {
			news.display();
		}
	}
	
	// Average Rate
	public void AverageRates() {
		for (News news : listNews) {
			news.calculate();
		}
	}
}
