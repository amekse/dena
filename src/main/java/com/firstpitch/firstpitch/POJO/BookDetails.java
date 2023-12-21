package com.firstpitch.firstpitch.POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookDetails {
	@JsonProperty("name")
	private String name = "";
	@JsonProperty("price")
	private float price = 0;
	@JsonProperty("author")
	private String author = "";
	@JsonProperty("description")
	private String description = "";
	
	public BookDetails(String name, float price, String author, String description) {
		this.name = name;
		this.description = description;
		this.author = author;
		this.price = price;
	}
	
	public String getDetails() {
		return this.name + " - " + this.price + " - " + this.author + " - " + this.description;
	}
}
