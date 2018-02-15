package com.pjrc.POCSpringDataH2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pjrc.POCSpringDataH2.exception.BookServiceException;
import com.pjrc.POCSpringDataH2.models.Book;
import com.pjrc.POCSpringDataH2.service.BookService;


@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("")
	public List<Book> findAll() {
		return bookService.findAll();
    }
	
	@GetMapping("/{id}")
	public Book findById(@PathVariable("id") int id) throws BookServiceException {
	        return bookService.findById(id);
	    }
	
	@PostMapping("/save")
	public Book saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@RequestParam("id") int id) {
		bookService.delete(id);
	}
	
	@PutMapping("/{id}")
	public void update(@RequestBody Book book) {
		bookService.update(book);
	}
}
