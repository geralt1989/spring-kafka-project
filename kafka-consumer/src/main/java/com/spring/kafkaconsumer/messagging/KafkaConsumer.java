package com.spring.kafkaconsumer.messagging;

import com.spring.kafkacommon.model.User;
import com.spring.kafkaconsumer.mapper.UserMapper;
import com.spring.kafkaconsumer.model.UserDB;
import com.spring.kafkaconsumer.service.MailSenderService;
import com.spring.kafkaconsumer.service.MongoService;
import com.spring.kafkaconsumer.service.implementation.MailSenderServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import java.util.Optional;

@Log4j2
@Component
@RequiredArgsConstructor
public class KafkaConsumer {

    private final UserMapper userMapper;
    private final MongoService mongoService;
    private final MailSenderService mailSenderService;

    @KafkaListener(topics="${custom.kafka.topic.users}", groupId = "${spring.kafka.consumer.group-id}")
    public void onMessage(User user) throws MessagingException {
        log.debug("Received user with id: '{}'", user.getId());
//        Optional.of(user)
//              .map(userMapper::mapToUserDB)
//              .map(mongoService::saveUser)
//              .ifPresent(mailSenderService::sendNotificationMailToAdmins);
        UserDB userDB = mongoService.saveUser(userMapper.mapToUserDB(user));
        mailSenderService.sendNotificationMailToAdmins(userDB);
    }
}
