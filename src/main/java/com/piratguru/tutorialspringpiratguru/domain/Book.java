package com.piratguru.tutorialspringpiratguru.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String isbn;
    private String title;
    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
                inverseJoinColumns = @JoinColumn(name = "author_id"))

    private Set<Author>authors;

    public Book(String isbn, String title,Set<Author> authors) {
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
    }

}
