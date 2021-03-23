package com.spring.kafkaconsumer.messagging;

import com.spring.kafkacommon.model.User;
import com.spring.kafkaconsumer.mapper.UserMapper;
import com.spring.kafkaconsumer.service.MongoService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaConsumer {

    private final UserMapper userMapper;
    private final MongoService mongoService;

    @KafkaListener(topics="${custom.kafka.topic.users}", groupId = "${spring.kafka.consumer.group-id}")
    public void onMessage(User user) {
        mongoService.saveUser(userMapper.mapToUserDB(user));
    }
}
