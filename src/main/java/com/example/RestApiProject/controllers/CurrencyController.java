package com.example.RestApiProject.controllers;

import com.example.RestApiProject.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/currency")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/controller")
    public Object[] getCurrencies(@RequestParam String from,@RequestParam String to,@RequestParam int amount ) {
        return currencyService.getCurrency(from, to, amount);
    }
}
