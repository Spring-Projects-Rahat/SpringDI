package com.java.springbasic.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.java.springbasic.component,com.java.springbasic.service.component"})
public class AppConfiguration {

}
