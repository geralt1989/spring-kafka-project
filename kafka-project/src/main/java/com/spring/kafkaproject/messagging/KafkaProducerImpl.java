package com.spring.kafkaproject.messagging;

import com.spring.kafkacommon.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducerImpl implements KafkaProducer{

    @Value("${custom.kafka.topic.users}")
    private String topic;

    private final KafkaTemplate<String, User> kafkaTemplate;

    @Override
    public User sendUser(User user) {
        kafkaTemplate.send(topic, user.getId(), user);
        return user;
    }
}
