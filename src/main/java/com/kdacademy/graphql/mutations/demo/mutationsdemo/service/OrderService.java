package com.kdacademy.graphql.mutations.demo.mutationsdemo.service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.kdacademy.graphql.mutations.demo.mutationsdemo.model.Coffee;
import com.kdacademy.graphql.mutations.demo.mutationsdemo.model.Order;
import com.kdacademy.graphql.mutations.demo.mutationsdemo.model.User;

import jakarta.annotation.PostConstruct;


@Service
public class OrderService {

    private List<Order> orders = new ArrayList<>() ;
    AtomicInteger id = new AtomicInteger(0) ;

    private final CoffeeService coffeeService ;
    private final UserService userService ;

    public OrderService(CoffeeService coffeeService, UserService userService) {
        this.coffeeService = coffeeService;
        this.userService = userService;
    }

    public List<Order> findAll(){
        return orders ;
    }

    public List<Order> findAllByUsername(String username){
        return orders.stream().filter(order -> order.user().username().equals(username)).toList() ;
    }

    public Optional<Order> findOne(Integer id) {
        return orders.stream().filter(order -> order.orderId() == id).findFirst();
    }

    public Order create(Coffee coffee, User userId){
        Order order = new Order(id.incrementAndGet(), coffee, userId, OffsetDateTime.now()) ;
        orders.add(order) ;
        return order ;
    }

    @PostConstruct
    private void init(){
        //create a few orders
        create(coffeeService.findOne(1).get(),userService.findOne(1).get());
        create(coffeeService.findOne(2).get(),userService.findOne(2).get());
        create(coffeeService.findOne(2).get(),userService.findOne(2).get());
    }
}
