package com.example.RestApiProject.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "rest")
@Data
public class RestConfiguration {

    private String baseUrl;
    private String convert;


}
