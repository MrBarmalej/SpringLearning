package com.example.spring2.config;

import com.example.spring2.Lesson37.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyBean myBean() {
        return new MyBean("Hello, Spring!");
    }
}