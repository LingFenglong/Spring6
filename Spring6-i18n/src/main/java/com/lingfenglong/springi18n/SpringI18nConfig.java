package com.lingfenglong.springi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan("com.lingfenglong.springi18n")
public class SpringI18nConfig {
    @Bean("messageSource")
    public ResourceBundleMessageSource getResourceBundleMessageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("springi18n");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
