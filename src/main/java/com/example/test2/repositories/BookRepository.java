package com.example.test2.repositories;

import com.example.test2.model.Author;
import com.example.test2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BookRepository extends JpaRepository<Book, Long> {

    Collection<Book> findAllByAuthor(String author);
}
