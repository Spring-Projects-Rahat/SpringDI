package com.java.springbasic.service.component;

import org.springframework.stereotype.Component;

@Component("emailservice")
public class EmailService implements MessageService {

	@Override
	public void sendMessage(String message, String reciever) {
		System.out.println("Email Message is being sent to:"+reciever+ " with message:"+ message);
		
	}

}
