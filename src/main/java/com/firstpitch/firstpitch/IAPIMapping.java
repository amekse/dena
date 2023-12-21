package com.firstpitch.firstpitch;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firstpitch.firstpitch.POJO.APIResponse;
import com.firstpitch.firstpitch.POJO.BookDetails;
import com.firstpitch.firstpitch.Repo.BookDetailsRepo;

@RequestMapping("/book")
public interface IAPIMapping {
	BookDetailsRepo bookDetailsRepo = new BookDetailsRepo();
	
	@PostMapping(
			value = "/addBook",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE
	)
	APIResponse addBook(@RequestBody BookDetails bookDetails);
}
