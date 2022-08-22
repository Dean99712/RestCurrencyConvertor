package com.example.RestApiProject.controllers;

import com.example.RestApiProject.model.Query;
import com.example.RestApiProject.model.Result;
import com.example.RestApiProject.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Currency;
import java.util.List;

@RestController
@RequestMapping("/api/currency")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @PostMapping("/convert")
    public Result getCurrencies(@RequestBody Query currency) {
        return currencyService.getCurrency(currency);
    }

}
