package com.firstpitch.firstpitch.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstpitch.firstpitch.POJO.BookDetails;

@Repository
public interface IBookDetailsRepo extends JpaRepository<BookDetails, Long> {
	
}
