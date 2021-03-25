package com.spring.kafkaconsumer.messagging;

import com.spring.kafkacommon.model.User;
import com.spring.kafkaconsumer.mapper.UserMapper;
import com.spring.kafkaconsumer.service.MongoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@RequiredArgsConstructor
public class KafkaConsumer {

    private final UserMapper userMapper;
    private final MongoService mongoService;

    @KafkaListener(topics="${custom.kafka.topic.users}", groupId = "${spring.kafka.consumer.group-id}")
    public void onMessage(User user) {
        mongoService.saveUser(userMapper.mapToUserDB(user));
        log.debug("Received user with id: '{}'", user.getId());
    }
}
