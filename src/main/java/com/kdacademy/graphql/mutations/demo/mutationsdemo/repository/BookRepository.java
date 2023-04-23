package com.kdacademy.graphql.mutations.demo.mutationsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kdacademy.graphql.mutations.demo.mutationsdemo.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
    
}
