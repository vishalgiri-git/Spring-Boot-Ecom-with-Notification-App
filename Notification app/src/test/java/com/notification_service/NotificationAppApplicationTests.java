package com.notification_service;

import com.notification_service.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NotificationAppApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private EmailService emailService;
	@Test
	void emailSenderTest(){
		emailService.sendWelcomEmail("vgiri1545@gmail.com",
				"test-subject",
				"test-message");

	}
}
