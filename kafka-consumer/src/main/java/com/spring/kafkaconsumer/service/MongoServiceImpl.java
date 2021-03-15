package com.spring.kafkaconsumer.service;

import com.spring.kafkaconsumer.model.User;
import com.spring.kafkaconsumer.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MongoServiceImpl implements MongoService {

    private final UsersRepository usersRepository;

    @Override
    public User saveUser(User user) {
        return usersRepository.save(user);
    }

}
