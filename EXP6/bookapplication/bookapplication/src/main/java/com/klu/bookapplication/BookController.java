package com.klu.bookapplication;

import java.awt.List;


import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	
	@Autowired
	BookRepository br;
	@PostMapping("/add")
	public void addBook(Book b) {
		br.save(b);
	}
	@GetMapping("/listall")
	public java.util.List<Book> listBooks()
	{
		
		return br.findAll();
				
	}
	@GetMapping("/listonebook/{bno}")
	public Optional<Book> listOneBook(int bno) {
		
		return br.findById(bno);
		
		}
	public void delete(int bno) {
		
		br.deleteById(bno);
		
	}
	@PutMapping("/update/{bno}") 
	public void updateBook(@PathVariable int bno, @RequestBody Book b) {
		
		b.setBno(bno);
		br.save(b);
	}
}
