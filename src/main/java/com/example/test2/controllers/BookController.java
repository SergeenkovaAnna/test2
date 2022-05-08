package com.example.test2.controllers;


import com.example.test2.model.Book;
import com.example.test2.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/getAllBooks")
    public ResponseEntity<Collection<Book>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @GetMapping("/getAllBooksByAuthor")
    public ResponseEntity<Collection<Book>> getAllBooksByAuthor(@RequestParam String author) {
        Collection<Book> booksByAuthor = bookService.getAllBooksByAuthor(author);
        return ResponseEntity.ok(booksByAuthor);
    }

}
