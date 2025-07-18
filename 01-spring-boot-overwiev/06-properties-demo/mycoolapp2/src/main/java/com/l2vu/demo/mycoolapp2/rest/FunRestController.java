package com.l2vu.demo.mycoolapp2.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName ;

    @Value("${team.name}")
    private String teamName;


    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach :"  + coachName + ",  TeamName : " + teamName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }


    @GetMapping("/workout")
    public String getDilyWorkout(){
        return "Run a hard 5k!";
    }

    @GetMapping("/success")
    public String getSucces(){
        return "You are study very hard";
    }


}
