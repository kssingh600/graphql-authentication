package com.kdacademy.graphql.mutations.demo.mutationsdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.kdacademy.graphql.mutations.demo.mutationsdemo.model.Product;
import com.kdacademy.graphql.mutations.demo.mutationsdemo.repository.ProductRepository;

@Controller
public class ProductController {

    private final ProductRepository productRepository ;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @QueryMapping
    public List<Product> allProducts(){
        return productRepository.findAll() ;
    }
}
