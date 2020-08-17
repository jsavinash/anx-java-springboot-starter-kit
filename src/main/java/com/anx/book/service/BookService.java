package com.anx.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anx.book.database.model.Book;
import com.anx.book.repository.BookRepository;

/**
 *
 * @author NHU LINH
 */
@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;

	public Book save(Book book) {
		return bookRepository.save(book);
	}

	public Iterable<Book> findAll() {
		return bookRepository.findAll();
	}
}
