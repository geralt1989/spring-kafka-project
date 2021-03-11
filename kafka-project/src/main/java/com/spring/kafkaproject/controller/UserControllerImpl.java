package com.spring.kafkaproject.controller;

import com.spring.kafkaproject.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerImpl implements UserController{

    @Override
    public ResponseEntity<?> saveUser(User user) {

        return null;
    }
}
