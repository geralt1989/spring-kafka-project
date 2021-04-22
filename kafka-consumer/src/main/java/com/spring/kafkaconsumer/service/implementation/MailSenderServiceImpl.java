package com.spring.kafkaconsumer.service.implementation;

import com.spring.kafkaconsumer.model.UserDB;
import com.spring.kafkaconsumer.service.MailGeneratorService;
import com.spring.kafkaconsumer.service.MailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.mail.internet.MimeMessage;

@Service
@RequiredArgsConstructor
public class MailSenderServiceImpl implements MailSenderService {

    private final JavaMailSender javaMailSender;
    private final MailGeneratorService mailGeneratorService;
    private final SpringTemplateEngine springTemplateEngine;

    @Override
    public UserDB sendNotificationMailToAdmins(UserDB user) {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            mailGeneratorService.enrichMail(user, mimeMessage);
            javaMailSender.send(mimeMessage);
            springTemplateEngine.clearTemplateCache();
            return user;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
