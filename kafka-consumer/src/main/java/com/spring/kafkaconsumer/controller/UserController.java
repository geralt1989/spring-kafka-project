package com.spring.kafkaconsumer.controller;


import com.spring.kafkaconsumer.model.UserDB;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/users")
public interface UserController {

    @GetMapping("/{id}")
    ResponseEntity<UserDB> getUserById(@PathVariable String id);

    @GetMapping
    ResponseEntity<List<UserDB>> getAllUsers();
}
