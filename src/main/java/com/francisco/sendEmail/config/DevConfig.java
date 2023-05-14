package com.francisco.sendEmail.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.francisco.sendEmail.services.EmailService;
import com.francisco.sendEmail.services.SendGridEmailService;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Bean
	public EmailService emailService() {
		return new SendGridEmailService();
	}

}
