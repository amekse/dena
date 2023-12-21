package com.firstpitch.firstpitch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstpitch.firstpitch.POJO.APIResponse;
import com.firstpitch.firstpitch.POJO.BookDetails;

@RestController
@RequestMapping("/book")
public class APIMap implements IAPIMapping {
	
	@GetMapping("")
	String welcome() {
		return "Welcome to Firstpitch";
	}
	
	@Override
	public APIResponse addBook(BookDetails bookDetails) {
		bookDetailsRepo.addBookToDb(bookDetails);
		return new APIResponse("Under progress", true);
	}
}
