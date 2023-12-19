package com.firstpitch.firstpitch;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firstpitch.firstpitch.POJO.APIResponse;
import com.firstpitch.firstpitch.POJO.BookDetails;
import com.firstpitch.firstpitch.Repo.BookDetailsRepo;

@RequestMapping("/default")
public interface IAPIMapping {
	BookDetailsRepo bookDetailsRepo = new BookDetailsRepo();
	
	@PostMapping("/addBook/")
	APIResponse addBook(@RequestBody BookDetails bookDetails);
}
