package com.francisco.sendEmail.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.francisco.sendEmail.services.EmailService;
import com.francisco.sendEmail.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}

}
