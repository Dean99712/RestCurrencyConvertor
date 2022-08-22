package com.example.RestApiProject.service;

import com.example.RestApiProject.config.WebClientConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    @Autowired
    private WebClientConfiguration webClientConfiguration;

    public Object[] getCurrency(String from, String to, int amount) {
        return webClientConfiguration
                .webClient()
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("/convert")
                        .queryParam("from", from)
                        .queryParam("to", to)
                        .queryParam("amount", amount)
                        .build())
                .retrieve()
                .bodyToMono(Object[].class).block();
    }
}
