package com.sheva.springSandbox.repositories;

import com.sheva.springSandbox.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
