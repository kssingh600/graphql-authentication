package com.kdacademy.graphql.mutations.demo.mutationsdemo.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;

import com.kdacademy.graphql.mutations.demo.mutationsdemo.model.Coffee;
import com.kdacademy.graphql.mutations.demo.mutationsdemo.model.Size;
import com.kdacademy.graphql.mutations.demo.mutationsdemo.service.CoffeeService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CoffeeController {

    private final CoffeeService coffeeService ;

    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
        log.info("All coffees: {}", coffeeService.findAll());
    }

    @Secured("ROLE_USER")
    @QueryMapping(value="allCoffee")
    public List<Coffee> findAll(){
        return coffeeService.findAll() ;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @MutationMapping(value = "createCoffee")
    public Coffee create(@Argument String name, @Argument Size size){
        return coffeeService.create(name, size) ;
    }
}
