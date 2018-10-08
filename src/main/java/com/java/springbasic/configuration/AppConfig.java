package com.java.springbasic.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.springbasic.component.ServiceConsumerApp;
import com.java.springbasic.service.component.EmailService;
import com.java.springbasic.service.component.MessageService;

@Configuration
public class AppConfig {

	@Bean
	public EmailService getService()
	{
		return new EmailService();
		
	}
	
	@Bean
	public ServiceConsumerApp getServiceConsumerApp()
	{
		return new ServiceConsumerApp();
		
	}
}
