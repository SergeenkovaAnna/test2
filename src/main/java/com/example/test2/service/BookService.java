package com.example.test2.service;

import com.example.test2.model.Author;
import com.example.test2.model.Book;

import java.util.Collection;

public interface BookService {

    Book addBook(Book book);

    Collection<Book> getAllBooks();

    Collection<Book> getAllBooksByAuthor(String author);

}
