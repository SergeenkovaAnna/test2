package com.example.test2.service.impl;

import com.example.test2.model.Author;
import com.example.test2.repositories.AuthorRepository;
import com.example.test2.service.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }
}
