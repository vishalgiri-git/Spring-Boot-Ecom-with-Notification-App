package com.notification_service.consumer;

import com.notification_service.entity.User;
import com.notification_service.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class UserEventConsumer {

    private final EmailService emailService;
    public UserEventConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    private final Logger logger = LoggerFactory.getLogger(UserEventConsumer.class);

    @KafkaListener(topics = "user-info", groupId = "notification-service", containerFactory = "userKafkaListenerFactory")
    public void consumeUserCreatedEvent(User user){
        logger.info("UserEventConsumer => event consumed");
        emailService.sendWelcomEmail(user.getEmail(), "Welcome to my app",user.getFirstName());
    }

}
