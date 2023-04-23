package com.kdacademy.graphql.mutations.demo.mutationsdemo.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.kdacademy.graphql.mutations.demo.mutationsdemo.model.Product;

public interface ProductRepository extends ListCrudRepository<Product, Integer>{
    
}
