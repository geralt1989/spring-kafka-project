package com.spring.kafkaproject.messagging;

import com.spring.kafkaproject.model.User;

public interface KafkaProducer {

    User sendUser(User user);
}
