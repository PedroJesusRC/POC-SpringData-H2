package com.pjrc.POCSpringDataH2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name="BOOK")
public class Book {
	@Id
	@GeneratedValue
	@Column(name="ID")
    private Long id;
	
	@Column(name="AUTHOR")
    private String author;
    
	@Column(name="TITLE")
    private String title;

}
