package com.firstpitch.firstpitch.POJO;

public class BookDetails {
	String name = "";
	float price = 0;
	String author = "";
	String description = "";
	
	public BookDetails(String name, float price, String author, String description) {
		this.name = name;
		this.description = description;
		this.author = author;
		this.price = price;
	}
}
