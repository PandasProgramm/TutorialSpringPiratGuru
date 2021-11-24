package com.piratguru.tutorialspringpiratguru.reposetorys;

import com.piratguru.tutorialspringpiratguru.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
