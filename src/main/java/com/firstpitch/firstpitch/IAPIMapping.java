package com.firstpitch.firstpitch;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.firstpitch.firstpitch.POJO.APIResponse;
import com.firstpitch.firstpitch.POJO.BookDetails;

@RestController
public interface IAPIMapping {
	@PostMapping(
			value = "/addBook",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE
	)
	APIResponse addBook(@RequestBody BookDetails bookDetails);
	
	@GetMapping(
			value = "/getBooksList",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE
	)
	APIResponse fetchBookList();
	
	@PatchMapping(
			value = "/updateBookById/{id}",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE
	)
	APIResponse updateBookById(@PathVariable Long id, @RequestParam(required = false, defaultValue="") String name, @RequestParam(required = false, defaultValue="0.00") float price, @RequestParam(required = false, defaultValue="") String author, @RequestParam(required = false, defaultValue="") String description);
	
	@DeleteMapping("/deleteBookById/{id}")
	APIResponse deleteBookById(@PathVariable Long id);
}
