package com.example.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springmongodb.model.Book;

public interface BookRepository extends MongoRepository<Book,Integer> {

}
