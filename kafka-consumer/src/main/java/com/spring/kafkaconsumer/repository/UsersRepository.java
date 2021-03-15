package com.spring.kafkaconsumer.repository;

import com.spring.kafkaconsumer.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<User, String> {

}
