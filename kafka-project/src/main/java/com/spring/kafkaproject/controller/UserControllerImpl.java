package com.spring.kafkaproject.controller;

import com.spring.kafkaproject.messagging.KafkaProducer;
import com.spring.kafkaproject.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController{

    private final KafkaProducer kafkaProducer;

    @Override
    public ResponseEntity<?> saveUser(User user) {
        return ResponseEntity.ok(kafkaProducer.sendUser(user));
    }
}
