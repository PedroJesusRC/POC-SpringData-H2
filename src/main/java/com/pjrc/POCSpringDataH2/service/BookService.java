package com.pjrc.POCSpringDataH2.service;

import java.util.List;

import com.pjrc.POCSpringDataH2.exception.BookServiceException;
import com.pjrc.POCSpringDataH2.models.Book;

public interface BookService {
	
	public List<Book> findAll();
	
	public Book findById(int id) throws BookServiceException;
	
	public Book addBook(Book book);
	
	public Book saveBook(Book book);
	
	public void delete(Integer id);
	
	public void update(Book book);

}
