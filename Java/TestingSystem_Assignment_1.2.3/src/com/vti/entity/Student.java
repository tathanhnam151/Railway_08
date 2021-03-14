package com.vti.entity;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private float score;
	
	public Student(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
		this.score = 0;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public void plusScore(float score) {
		this.score += score;
	}
	
	@Override
	public String toString() {
		String grade;
		if (score < 4.0) {
			grade = "Yeu";
		} else if (score < 6) {
			grade = "Trung binh";
		} else if (score < 8) {
			grade = "Kha";
		} else {
			grade = "Gioi";
		}

		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", hometown='" + hometown + '\'' + ", score="
				+ score + ", xepLoai='" + grade + '\'' + '}';
	}
}
