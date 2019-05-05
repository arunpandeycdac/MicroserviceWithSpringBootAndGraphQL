package com.arun.spring.graphql.api.datafetcher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arun.spring.graphql.api.entity.Book;
import com.arun.spring.graphql.api.repository.BookRepository;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class AllBookDataFetcher implements DataFetcher<List<Book>> {
	@Autowired
	private BookRepository repository;

	@Override
	public List<Book> get(DataFetchingEnvironment environment) {
		return repository.findAll();
	}

}
