package com.spring.kafkaproject.controller;

import com.spring.kafkacommon.model.User;
import com.spring.kafkaproject.messagging.KafkaProducer;
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
