package com.spring.kafkaconsumer.repository;

import com.spring.kafkacommon.model.Role;
import com.spring.kafkaconsumer.model.UserDB;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UsersRepository extends MongoRepository<UserDB, String> {

    @Query(value = "{'account.role': ?0}")
    List<UserDB> findAllByRole(Role role);

}
