package com.example.config;

import org.springframework.context.MessageSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class ApplicationConfig {
    public MessageSource messageSource(){
        ResourceBundleMessageSource messageSource= new ResourceBundleMessageSource();
        messageSource.setBasename("ValidateMessage");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
