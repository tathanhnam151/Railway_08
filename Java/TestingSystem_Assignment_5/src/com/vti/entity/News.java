package com.vti.entity;

public class News implements INews {
	
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	private int[] rates;
	
	public News() { 
	}

	public News(String title, String publishDate, String author, String content) {
		super();
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
	}
	
	public News(int id, String title, String publishDate, String author, String content, float averageRate) {
		super();
		this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
		this.averageRate = averageRate;
	}
		
	
	public int[] getRates() {
		return rates;
	}

	public void setRates(int[] rates) {
		this.rates = rates;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPunlishDate(String punlishDate) {
		this.publishDate = punlishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", publishDate=" + publishDate + ", author=" + author
				+ ", content=" + content + ", averageRate=" + averageRate + "]";
	}

	@Override
	public void display() {
		System.out.println("Title: " + title);
		System.out.println("Publish Date:" + publishDate);
		System.out.println("Author:" + author);
		System.out.println("Content: " + content);
		System.out.println("Average Rate: " + averageRate);
		System.out.println("\n");
	}
	
	@Override
	public float calculate() {
		averageRate = (float) (rates[0] + rates[1] + rates[2]) / 3;
		return averageRate;
	}
}
