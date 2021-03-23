package com.spring.kafkaconsumer.repository;

import com.spring.kafkaconsumer.model.UserDB;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<UserDB, String> {

}
