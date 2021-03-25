package com.spring.kafkaconsumer.service;

import com.spring.kafkaconsumer.model.UserDB;
import com.spring.kafkaconsumer.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MongoServiceImpl implements MongoService {

    private final UsersRepository usersRepository;

    @Override
    public UserDB saveUser(UserDB userDB) {
        return usersRepository.save(userDB);
    }

    @Override
    public Optional<UserDB> getUserById(String id) {
        return usersRepository.findById(id);
    }

    @Override
    public List<UserDB> getAllUsers() {
        return usersRepository.findAll();
    }

}
