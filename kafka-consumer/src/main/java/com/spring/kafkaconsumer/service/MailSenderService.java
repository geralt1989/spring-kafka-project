package com.spring.kafkaconsumer.service;


import com.spring.kafkaconsumer.model.UserDB;

import javax.mail.MessagingException;

public interface MailSenderService {

    UserDB sendNotificationMailToAdmins(UserDB user);

}
