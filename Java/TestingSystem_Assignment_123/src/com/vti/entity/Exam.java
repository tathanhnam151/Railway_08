package com.vti.entity;
import java.util.Date;

public class Exam {
	int id;
	String code;
	String title;
	CategoryQuestion category;
	byte duration;
	Account creator;
	Date createDate;
	Question[] questions;
}

