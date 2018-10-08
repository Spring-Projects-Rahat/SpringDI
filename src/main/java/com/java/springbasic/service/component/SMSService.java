package com.java.springbasic.service.component;

import org.springframework.stereotype.Component;

@Component("ssmservice")
public class SMSService implements MessageService {

	@Override
	public void sendMessage(String message, String reciever) {
		System.out.println("SMS Message is being sent to:"+reciever+ " with message:"+ message);
		
	}

}
