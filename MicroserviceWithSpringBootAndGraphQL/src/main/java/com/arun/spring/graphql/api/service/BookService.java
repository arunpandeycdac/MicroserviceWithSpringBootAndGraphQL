package com.arun.spring.graphql.api.service;

import java.util.*;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.arun.spring.graphql.api.entity.Book;
import com.arun.spring.graphql.api.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository repository;

	@PostConstruct
	public void initBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book("101", "The Science of Marvel",
				"22-12-2017", new String[] { "Sebastian" },
				"Infinity Stones"));
		books.add(new Book("102", "The Sixth Extinction",
				"22-12-2017", new String[] { "Sebastian", "Elizabeth" },
				"Infinity Stones"));
		books.add(new Book("103", "The Science of Marvel -2",
				"22-12-2019", new String[] { "Sebastian" },
				"Infinity Stones"));
		repository.save(books);
	}

	public List<Book> findAllBooks() {
		return repository.findAll();
	}

	public Book findBookById(String movieId) {
		return repository.findOne(movieId);
	}
}
