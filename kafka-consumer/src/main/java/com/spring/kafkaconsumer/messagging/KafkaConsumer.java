package com.spring.kafkaconsumer.messagging;

import com.spring.kafkaconsumer.model.User;
import com.spring.kafkaconsumer.service.MongoService;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaConsumer {

    private final MongoService mongoService;

    @KafkaListener(topics="${custom.kafka.topic.users}", groupId = "${spring.kafka.consumer.group-id}")
    public void onMessage(ConsumerRecord<String, User> message) {

        mongoService.saveUser(message.value());

    }

}
