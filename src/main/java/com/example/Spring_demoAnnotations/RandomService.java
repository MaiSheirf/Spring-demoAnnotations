package com.example.Spring_demoAnnotations;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements fortuneService{
    @Override
    public String getFortune() {
        return "random";
    }
}
