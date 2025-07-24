package com.alperenaktug.springbootcoredemo.common;


import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach(){
        System.out.println("In constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Tenis için 15 dakika atış çalış";
    }
}
