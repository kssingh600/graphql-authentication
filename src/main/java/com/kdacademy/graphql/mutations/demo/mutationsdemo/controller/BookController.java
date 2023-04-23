package com.kdacademy.graphql.mutations.demo.mutationsdemo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.kdacademy.graphql.mutations.demo.mutationsdemo.model.Book;
import com.kdacademy.graphql.mutations.demo.mutationsdemo.model.BookInput;
import com.kdacademy.graphql.mutations.demo.mutationsdemo.repository.BookRepository;

@Controller
public class BookController {

    private final BookRepository bookRepository ;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @QueryMapping
    public List<Book> findAllBooks(){
        return bookRepository.findAll() ;
    }

    @MutationMapping
    public Book createBook(@Argument String title,@Argument Integer pages,@Argument String author){
        Book book = new Book(title, pages, author) ;
        return bookRepository.save(book);
    }

    @MutationMapping
    public Book addBook(@Argument BookInput book){
        return bookRepository.save(new Book(book.title(), book.pages(), book.author())) ;
    }

    @MutationMapping
    public List<Book> batchCreate(@Argument List<BookInput> books){
        return bookRepository.saveAll(books.stream().map(
            (book) -> new Book(book.title(), book.pages(), book.author()
        )).collect(Collectors.toList())) ; 
    }
}
