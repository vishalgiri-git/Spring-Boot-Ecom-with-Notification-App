package com.notification_service.serviceImpl;

import com.notification_service.service.GenerateHtmlService;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

public class GenerateHtmlServiceImpl implements GenerateHtmlService {

    private TemplateEngine templateEngine;
    @Override
     public String welcomeHtmlEmail(String firstName) {
        Context context = new Context();
        context.setVariable("firstName",firstName);

        return templateEngine.process("welcome-email", context);
    }
}
