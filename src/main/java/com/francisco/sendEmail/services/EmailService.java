package com.francisco.sendEmail.services;

import com.francisco.sendEmail.dto.EmailDTO;

public interface EmailService {
	
	void sendEmail(EmailDTO dto);
}
