package com.sheva.springSandbox.repositories;

import com.sheva.springSandbox.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
