package com.kdacademy.graphql.mutations.demo.mutationsdemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kdacademy.graphql.mutations.demo.mutationsdemo.model.User;

import jakarta.annotation.PostConstruct;

@Service
public class UserService {
    private List<User> users = new ArrayList<>() ;

    public List<User> findAll(){
        return users ;
    }

    public Optional<User> findOne(Integer id){
        return users.stream().filter(user -> user.userId() == id).findFirst() ;
    }

    public void create(int id, String username){
        users.add(new User(id, username)) ;
    }

    @PostConstruct
    private void init(){
        create(1, "user") ;
        create(2, "admin") ;
    }
}
