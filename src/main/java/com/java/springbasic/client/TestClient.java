package com.java.springbasic.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.springbasic.component.ServiceConsumerApp;
import com.java.springbasic.configuration.AppConfig;
import com.java.springbasic.configuration.AppConfiguration;
import com.java.springbasic.service.component.EmailService;
import com.java.springbasic.service.component.MessageService;

public class TestClient {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		//MessageService srvc=context.getBean(EmailService.class);
		//srvc.sendMessage("I am Rahat", "Rahat");
		ServiceConsumerApp consumer=context.getBean(ServiceConsumerApp.class);
		consumer.sendEmailMessage("You are Rahul", "Rahul");
		consumer.sendSMSMessage("You are Rahul", "Rahul");
	}

}
