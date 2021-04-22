package com.spring.kafkaconsumer.service;

import com.spring.kafkacommon.model.Role;
import com.spring.kafkaconsumer.model.UserDB;


import java.util.List;
import java.util.Optional;

public interface MongoService {

    UserDB saveUser(UserDB user);

    Optional<UserDB> getUserById(String id);

    List<UserDB> getAllUsers();

    List<UserDB> getUsersByRole(Role role);

}
