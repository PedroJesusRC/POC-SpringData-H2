package com.pjrc.POCSpringDataH2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BookServiceException extends Exception{

	private static final long serialVersionUID = 1L;

	public BookServiceException() {

	}

	public BookServiceException(String message) {
		super(message);

	}

	public BookServiceException(Throwable ex) {
		super(ex);

	}

	public BookServiceException(String message, Throwable ex) {
		super(message, ex);
	}
	
}
