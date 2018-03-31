package com.sheva.springSandbox.bootstrap;

import com.sheva.springSandbox.model.Author;
import com.sheva.springSandbox.model.Book;
import com.sheva.springSandbox.model.Publisher;
import com.sheva.springSandbox.repositories.AuthorRepository;
import com.sheva.springSandbox.repositories.BookRepository;
import com.sheva.springSandbox.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Publisher publisher = new Publisher("Smith, Elder & Co.", "15 Waterloo Place in London");
        Author author = new Author("Charlotte", "Bronte");
        Book book = new Book("Jane Eyre", "1234", publisher);
        author.getBooks().add(book);
        book.getAuthors().add(author);

        publisherRepository.save(publisher);
        authorRepository.save(author);
        bookRepository.save(book);
    }
}
