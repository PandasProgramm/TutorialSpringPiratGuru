package com.piratguru.tutorialspringpiratguru.bootstrap;

import com.piratguru.tutorialspringpiratguru.domain.Author;
import com.piratguru.tutorialspringpiratguru.domain.Book;
import com.piratguru.tutorialspringpiratguru.domain.Publisher;
import com.piratguru.tutorialspringpiratguru.reposetorys.AuthorRepository;
import com.piratguru.tutorialspringpiratguru.reposetorys.BookRepository;
import com.piratguru.tutorialspringpiratguru.reposetorys.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("Started...");
        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");
        Author eric = new Author("Eric","Evans");
        Book DDD = new Book("Domain Driven Design","123123");
        eric.getBooks().add(DDD);
        DDD.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(DDD);

        publisher.getBooks().add(DDD);
        publisherRepository.save(publisher);
        Author rod = new Author("Rod","Johnson");
        Book jdbc = new Book("JDBC Book","234234");
        rod.getBooks().add(jdbc);
        jdbc.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(jdbc);

        System.out.println("Startet in Bootstrap");
        System.out.println("Number of Books:" + bookRepository.count());
        System.out.println("Number of authors:" + authorRepository.count());
        System.out.println("Number of publisher:" + publisherRepository.count());
    }
}
