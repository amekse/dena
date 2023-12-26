package com.firstpitch.firstpitch.Repo;

import java.util.List;

import com.firstpitch.firstpitch.POJO.BookDetails;

public interface IBookDetailsService {
	public List<BookDetails> allBooksList();
	void addBookDetails(BookDetails bookDetails);
}
