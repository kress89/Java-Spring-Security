package com.example.payment.payment.config;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    Gson gson(){
        return new Gson();
    }
}
