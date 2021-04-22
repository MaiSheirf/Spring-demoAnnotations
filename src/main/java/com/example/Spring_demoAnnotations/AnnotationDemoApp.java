package com.example.Spring_demoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] Args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        coach thecoach = context.getBean("tennisCoach",coach.class);
        System.out.println(thecoach.getDailyWork());
        System.out.println(thecoach.getFortuneService());
        context.close();
    }
}
