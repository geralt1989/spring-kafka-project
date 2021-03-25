package com.spring.kafkaconsumer.controller;

import com.spring.kafkaconsumer.model.UserDB;
import com.spring.kafkaconsumer.service.MongoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController{

    private final MongoService mongoService;

    @Override
    public ResponseEntity<UserDB> getUserById(String id) {
        return ResponseEntity.of(mongoService.getUserById(id));
    }

    @Override
    public ResponseEntity<List<UserDB>> getAllUsers() {
        return ResponseEntity.ok(mongoService.getAllUsers());
    }
}
