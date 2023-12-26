package com.firstpitch.firstpitch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstpitch.firstpitch.POJO.APIResponse;
import com.firstpitch.firstpitch.POJO.BookDetails;
import com.firstpitch.firstpitch.Repo.BookDetailsRepo;

@RestController
@RequestMapping("/book")
public class APIMap implements IAPIMapping {
	
	@Autowired
	BookDetailsRepo bookDetailsRepo;
	
	@GetMapping("")
	String welcome() {
		return "Welcome to Firstpitch";
	}
	
	@Override
	public APIResponse addBook(BookDetails bookDetails) {
		bookDetailsRepo.addBookDetails(bookDetails);
		return new APIResponse("Under progress", true);
	}

	@Override
	public APIResponse fetchBookList() {
		List<BookDetails> bookList = bookDetailsRepo.allBooksList();
		System.out.println(bookList);
		return new APIResponse("Under process", true);
	}
}
