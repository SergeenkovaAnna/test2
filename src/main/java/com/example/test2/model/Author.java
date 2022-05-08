package com.example.test2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Author {

    @Id
    @GeneratedValue
    private Long idAuthor;
    private String name;

    @OneToMany(mappedBy = "authorBook")
    private Collection<Book> books;

    public Author(Long idAuthor, String name) {
        this.idAuthor = idAuthor;
        this.name = name;
    }

    public Author() {

    }

    public Long getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Long idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(idAuthor, author.idAuthor) && Objects.equals(name, author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAuthor, name);
    }

    @Override
    public String toString() {
        return "Author{" +
                "idAuthor=" + idAuthor +
                ", name='" + name + '\'' +
                '}';
    }
}
