package com.assignment04;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PageCounterConfig {
    @Bean
    public PageCounter getPageCounter(){
        return new PageCounter();
    }
}