package com.francisco.sendEmail.services.exceptions;

public class EmailException extends RuntimeException {
	private static final long serialVersionUID = 6310397249904860928L;

	public EmailException(String msg) {
		super(msg);
	}

}
