package com.firstpitch.firstpitch.Services.copy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstpitch.firstpitch.POJO.BookDetails;
import com.firstpitch.firstpitch.Repo.IBookDetailsRepo;

@Service
public class BookDetailsService implements IBookDetailsService{
	
	@Autowired
	IBookDetailsRepo bookDetailsRepo;

	@Override
	public List<BookDetails> fetchBookList() {
		List<BookDetails> booksList = new ArrayList<>();
		try {
			booksList = bookDetailsRepo.findAll();
		} catch (Exception e) {
			System.out.println();
		}
		return booksList;
	}

	@Override
	public boolean addBookDetails(BookDetails bookDetails) {
		try {
			BookDetails bookDetailsResponse = bookDetailsRepo.save(bookDetails);
			if(bookDetails.equals(bookDetailsResponse)) {
				return true;
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}

}
