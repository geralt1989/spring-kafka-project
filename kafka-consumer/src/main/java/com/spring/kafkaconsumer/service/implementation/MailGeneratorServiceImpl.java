package com.spring.kafkaconsumer.service.implementation;

import com.spring.kafkacommon.model.Account;
import com.spring.kafkacommon.model.Role;
import com.spring.kafkacommon.model.User;
import com.spring.kafkaconsumer.model.UserDB;
import com.spring.kafkaconsumer.service.MailGeneratorService;
import com.spring.kafkaconsumer.service.MongoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

@Service
@RequiredArgsConstructor
public class MailGeneratorServiceImpl implements MailGeneratorService {

        @Value("${spring.mail.username}")
        String from;

        private final MongoService mongoService;
        private final SpringTemplateEngine springTemplateEngine;

        @Override
        public void enrichMail(UserDB user, MimeMessage mimeMessage) throws MessagingException {
            String text = springTemplateEngine.process("registration",createContext(user));
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
            mimeMessageHelper.setFrom(from);
            mimeMessageHelper.setSubject("Registration successful");
            mimeMessageHelper.setTo(user.getAccount().getEmail());
            mimeMessageHelper.setBcc(getAdminMails());
            mimeMessageHelper.setText(text);
        }

        private String[] getAdminMails() {
            return mongoService.getUsersByRole(Role.ADMIN)
                    .stream()
                    .map(UserDB::getAccount)
                    .map(Account::getEmail)
                    .toArray(String[]::new);
        }

        private Context createContext(UserDB user) {
            Context context = new Context();
            context.setVariable("user", user);
            return context;
        }

}
