package com.example.RestApiProject.service;

import com.example.RestApiProject.config.WebClientConfiguration;
import com.example.RestApiProject.model.Query;
import com.example.RestApiProject.model.Result;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Currency;

@Service
public class CurrencyService {

    @Autowired
    private WebClientConfiguration webClientConfiguration;

    @Autowired
    private WebClient webClient;

    public Result getCurrency(Query query) {

        String response = webClientConfiguration
                .webClient()
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("/convert")
                        .queryParam("from", query.getFrom())
                        .queryParam("to", query.getTo())
                        .queryParam("amount", query.getAmount())
                        .build())
                .retrieve()
                .bodyToMono(String.class).block();

        JsonObject jsonObject = new Gson().fromJson(response, JsonObject.class);
        JsonElement result = jsonObject.get("result");

        return new Result(result.getAsFloat());


    }

}
