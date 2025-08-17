package com.notification_service.serviceImpl;

import com.notification_service.entity.User;
import com.notification_service.service.EmailService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class EmailServiceImpl implements EmailService {
    private final Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);
    private JavaMailSender javaMailSender;
    private TemplateEngine templateEngine;

    public EmailServiceImpl(JavaMailSender javaMailSender, TemplateEngine templateEngine) {
        this.javaMailSender = javaMailSender;
        this.templateEngine = templateEngine;
    }

    @Override
    public void sendWelcomEmail(String to, String subject, String name)  {

        Context content = new Context();
        content.setVariable("firstName", name);
        content.setVariable("message", "we are excited to have on board");

        // process the html content.
        String htmlContent = templateEngine.process("welcome-email", content);



        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper =
                    new MimeMessageHelper(mimeMessage, true, "UTF-8");

            mimeMessageHelper.setTo(to);
            mimeMessageHelper.setFrom("sparklefury1999@gmail.com");
            mimeMessageHelper.setText(htmlContent, true);
            mimeMessageHelper.setSubject(subject);

            javaMailSender.send(mimeMessage);

            logger.info("Successfully welcome mail sent to: {}",to);
        } catch (Exception e) {
            logger.error("Failed to send email to: {}, error: {}", to, e.getMessage(), e);
        }


    }
}
