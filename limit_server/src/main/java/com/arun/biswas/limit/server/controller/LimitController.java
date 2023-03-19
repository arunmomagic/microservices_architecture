package com.arun.biswas.limit.server.controller;

import com.arun.biswas.limit.server.config.Configuration;
import com.arun.biswas.limit.server.model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @Autowired
    private Configuration configuration;
    @GetMapping("/limit/service")
    public LimitConfiguration getLimitConfig(){
        return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
    }
}
