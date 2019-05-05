package com.arun.spring.graphql.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arun.spring.graphql.api.entity.Book;

public interface BookRepository extends JpaRepository<Book, String> {

}
