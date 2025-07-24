package com.alperenaktug.springbootcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Basketbol için 30 dakika çalış";
    }
}
