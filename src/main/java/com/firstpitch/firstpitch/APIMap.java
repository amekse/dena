package com.firstpitch.firstpitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstpitch.firstpitch.POJO.APIResponse;
import com.firstpitch.firstpitch.POJO.BookDetails;
import com.firstpitch.firstpitch.Services.copy.BookDetailsService;

import CustomUtils.TypeConverter;

@RestController
@RequestMapping("/book")
public class APIMap implements IAPIMapping {
	
	@Autowired
	BookDetailsService bookDetailsService;
	
	@GetMapping("")
	String welcome() {
		return "Welcome to Firstpitch";
	}
	
	@Override
	public APIResponse addBook(BookDetails bookDetails) {
		if(bookDetailsService.addBookDetails(bookDetails)) {
			return new APIResponse("New entry successful", false);
		} else {
			return new APIResponse("New entry failed", true);
		}
	}

	@Override
	public APIResponse fetchBookList() {
		try {
			TypeConverter typeConverter = new TypeConverter(bookDetailsService.fetchBookList());
			return new APIResponse(String.format("%s", typeConverter.booksListToString()), false);
		} catch (Exception e) {
			System.out.println(e);
			return new APIResponse("Server Error", true);
		}
	}

	@Override
	public APIResponse updateBookById(Long id, String name, float price, String author, String description) {
		if(bookDetailsService.updateBookDetails(id, name, price, author, description)) {
			return new APIResponse("Update successful", false);
		}
		return new APIResponse("Update failed", true);
	}

	@Override
	public APIResponse deleteBookById(Long id) {
		BookDetails bookDetails = bookDetailsService.deleteBookDetails(id);
		if(bookDetails != null) {
			TypeConverter typeConverter = new TypeConverter(bookDetailsService.fetchBookList());
			return new APIResponse(String.format("%s", typeConverter.booksListToString()), false);
		}
		return new APIResponse("Update failed", true);
	}

	
}
