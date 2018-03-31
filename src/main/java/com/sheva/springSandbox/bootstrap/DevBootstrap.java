package com.sheva.springSandbox.bootstrap;

import com.sheva.springSandbox.model.Author;
import com.sheva.springSandbox.model.Book;
import com.sheva.springSandbox.repositories.AuthorRepository;
import com.sheva.springSandbox.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRep;
    private BookRepository bookRep;

    public DevBootstrap(AuthorRepository authorRep, BookRepository bookRep) {
        this.authorRep = authorRep;
        this.bookRep = bookRep;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Author author = new Author("Charlotte", "Bronte");
        Book book = new Book("Jane Eyre", "1234", "Smith, Elder & Co.");
        author.getBooks().add(book);
        book.getAuthors().add(author);

        authorRep.save(author);
        bookRep.save(book);
    }
}
