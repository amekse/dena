package com.firstpitch.firstpitch.POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
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
	
	public BookDetails(String name, float price, String author, String description) {
		this.name = name;
		this.description = description;
		this.author = author;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format(
	        "Book[id=%d, name='%s', price='%.2f', author='%s', description='%s']",
	        id, name, price, author, description
	    );
	}
}
