package com.pjrc.POCSpringDataH2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pjrc.POCSpringDataH2.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
