package com.example.test2.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long idBook;
    private String nameBook;
    private String author;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author authorBook;

    public Book(Long idBook, String nameBook, String author) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.author = author;
    }

    public Book() {

    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(idBook, book.idBook) && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBook, nameBook, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
