package com.firstpitch.firstpitch.Repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.firstpitch.firstpitch.POJO.BookDetails;

@Service
public class BookDetailsRepo implements IBookDetailsService {
	@Autowired
	IBookDetailsRepo iBookDetailsRepo;

	@Override
	@Transactional
	public List<BookDetails> allBooksList() {
		return (List<BookDetails>) iBookDetailsRepo.findAll();
	}

	@Override
	@Transactional
	public void addBookDetails(BookDetails bookDetails) {
		iBookDetailsRepo.save(bookDetails);
	}

}
