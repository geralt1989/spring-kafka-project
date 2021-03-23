package com.spring.kafkaproject.messagging;

import com.spring.kafkacommon.model.User;

public interface KafkaProducer {

    User sendUser(User user);
}
