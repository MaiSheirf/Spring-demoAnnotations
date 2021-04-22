package com.example.Spring_demoAnnotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements fortuneService{
    @Override
    public String getFortune() {
        return "happy fortune servic";
    }
}
