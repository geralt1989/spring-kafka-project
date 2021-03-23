package com.spring.kafkaconsumer.service;

import com.spring.kafkaconsumer.model.UserDB;

public interface MongoService {

    UserDB saveUser(UserDB user);

}
