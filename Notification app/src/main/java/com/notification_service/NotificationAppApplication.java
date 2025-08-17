package com.notification_service;

import com.notification_service.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class NotificationAppApplication {
	private static final Logger logger=LoggerFactory.getLogger(NotificationAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(NotificationAppApplication.class, args);
		logger.info("Notification service started.........................");

	}

}
