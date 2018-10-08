package com.java.springbasic.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.java.springbasic.service.component.MessageService;

@Component
public class ServiceConsumerApp {
	
	@Autowired
	@Qualifier("emailservice")
	MessageService emailsrvc;
	
	@Autowired
	@Qualifier("ssmservice")
	MessageService smssrvc;
	
	public void sendEmailMessage(String message,String reciever)
	{
		emailsrvc.sendMessage(message, reciever);
	}

	public void sendSMSMessage(String message,String reciever)
	{
		smssrvc.sendMessage(message, reciever);
	}
}
