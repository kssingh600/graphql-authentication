package com.kdacademy.graphql.mutations.demo.mutationsdemo.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.kdacademy.graphql.mutations.demo.mutationsdemo.model.Order;
import com.kdacademy.graphql.mutations.demo.mutationsdemo.service.OrderService;

@Controller
public class OrderController {
    private final OrderService orderService ;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    
    @QueryMapping
    public List<Order> findAllOrders(Principal principal){
        return orderService.findAllByUsername(principal.getName()) ;
    }
}
