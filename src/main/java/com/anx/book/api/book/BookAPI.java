package com.anx.book.api.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anx.book.api.APIName;
import com.anx.book.api.response.model.StatusResponse;
import com.anx.book.database.model.Book;
import com.anx.book.service.BookService;

@RestController
public class BookAPI {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = APIName.Book, method = RequestMethod.GET, produces = APIName.CHARSET)
	public Object getAllBooks() {
		List<Book> books = (List<Book>) bookService.findAll();
		return (new StatusResponse(200, books));
	}
}
