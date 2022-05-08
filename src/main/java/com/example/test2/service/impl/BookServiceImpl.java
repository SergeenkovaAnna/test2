package com.example.test2.service.impl;

import com.example.test2.model.Author;
import com.example.test2.model.Book;
import com.example.test2.repositories.BookRepository;
import com.example.test2.service.BookService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Collection<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Collection<Book> getAllBooksByAuthor(String author) {
        return bookRepository.findAllByAuthor(author);
    }
}
