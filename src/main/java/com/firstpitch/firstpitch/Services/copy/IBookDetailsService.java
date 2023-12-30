package com.firstpitch.firstpitch.Services.copy;

import java.util.List;

import com.firstpitch.firstpitch.POJO.BookDetails;

public interface IBookDetailsService {
	List<BookDetails> fetchBookList();
	boolean addBookDetails(BookDetails bookDetails);
}
