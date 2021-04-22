package com.spring.kafkaconsumer.service.implementation;

import com.spring.kafkacommon.model.Role;
import com.spring.kafkaconsumer.model.UserDB;
import com.spring.kafkaconsumer.repository.UsersRepository;
import com.spring.kafkaconsumer.service.MongoService;
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

    @Override
    public List<UserDB> getUsersByRole(Role role) {
        return usersRepository.findAllByRole(role);
    }


}
