package com.firstpitch.firstpitch.POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookdetails")
public class BookDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "name")
	@JsonProperty("name")
	private String name = "";
	@JsonProperty("price")
	@Column(name = "price")
	private float price = 0;
	@JsonProperty("author")
	@Column(name = "author")
	private String author = "";
	@JsonProperty("description")
	@Column(name = "description")
	private String description = "";
	
	public BookDetails() {}
	
	public BookDetails(String name, float price, String author, String description) {
		this.name = name;
		this.description = description;
		this.author = author;
		this.price = price;
	}
	
	
	public void updateDetails(String name, float price, String author, String description) {
		if(name.length() > 0) {
			this.name = name;
		}
		
		if(price > 0) {
			this.price = price;
		}
		
		if(author.length() > 0) {
			this.author = author;
		}
		
		if(description.length() > 0) {
			this.description = description;
		}
	}
	
	public String toString() {
		return String.format(
	        "Book[id=%d, name='%s', price='%.2f', author='%s', description='%s']",
	        id, name, price, author, description
	    );
	}
}
