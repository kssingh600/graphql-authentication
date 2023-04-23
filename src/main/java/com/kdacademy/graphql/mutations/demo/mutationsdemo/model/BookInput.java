package com.kdacademy.graphql.mutations.demo.mutationsdemo.model;

public record BookInput(
    String title,
    Integer pages,
    String author
){
    
}
