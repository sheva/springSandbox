package com.sheva.springSandbox.repositories;

import com.sheva.springSandbox.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
