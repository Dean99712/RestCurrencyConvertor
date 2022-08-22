package com.example.RestApiProject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfiguration {

    @Autowired
    private RestConfiguration configuration;

    @Bean
    public WebClient webClient() {

        return WebClient.builder()
                .baseUrl("https://api.exchangerate.host")
                .build();
    }
}
