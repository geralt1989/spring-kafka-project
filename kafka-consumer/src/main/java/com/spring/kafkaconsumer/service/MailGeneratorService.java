package com.spring.kafkaconsumer.service;

import com.spring.kafkacommon.model.User;
import com.spring.kafkaconsumer.model.UserDB;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

public interface MailGeneratorService {
    void enrichMail(UserDB user, MimeMessage mimeMessage) throws MessagingException;
}
