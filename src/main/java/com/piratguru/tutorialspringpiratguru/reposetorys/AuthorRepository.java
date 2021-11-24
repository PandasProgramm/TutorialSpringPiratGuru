package com.piratguru.tutorialspringpiratguru.reposetorys;

import com.piratguru.tutorialspringpiratguru.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> { }
