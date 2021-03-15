package com.spring.kafkaconsumer.service;

import com.spring.kafkaconsumer.model.User;

public interface MongoService {
    User saveUser(User user);
}
