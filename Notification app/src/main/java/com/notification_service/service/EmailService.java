package com.notification_service.service;

import com.notification_service.entity.User;
import jakarta.mail.MessagingException;

public interface EmailService {

    void sendWelcomEmail(String to, String sub, String name) ;

}
