package com.alperenaktug.springbootcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    public BaseballCoach(){
        System.out.println("In constructor : " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Basketbol için 30 dakika çalış";
    }
}
