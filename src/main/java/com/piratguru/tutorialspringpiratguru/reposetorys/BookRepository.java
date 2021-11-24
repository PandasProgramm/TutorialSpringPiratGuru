package com.piratguru.tutorialspringpiratguru.reposetorys;

import com.piratguru.tutorialspringpiratguru.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
