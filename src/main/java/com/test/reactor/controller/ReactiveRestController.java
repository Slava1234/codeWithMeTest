package com.test.reactor.controller;


import com.test.reactor.model.User;
import com.test.reactor.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ReactiveRestController {


    @Autowired
    private UserRepo userRepo;

    @GetMapping
    public Flux<User> getAllEmployees() {
        return userRepo.findAll();
    }



}
