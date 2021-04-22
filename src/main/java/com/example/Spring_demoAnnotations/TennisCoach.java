package com.example.Spring_demoAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TennisCoach implements coach{
    @Autowired
    @Qualifier("randomService")
    private fortuneService fortune;

    /*public TennisCoach(fortuneService fortune){
        fortune=fortune;
    }*/
    @Override
    public String getDailyWork() {
        return "tennis coach";
    }

    @Override
    public String getFortuneService() {
        return fortune.getFortune();
    }
    @PostConstruct
    public String startup(){
        return "start";
    }
}
