package com.luv2code.springdemo;

public class KarateCoach implements Coach {

    private FortuneService fortuneService;

    public KarateCoach() {

    }

    public KarateCoach(FortuneService myFortuneService) {
        fortuneService = myFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do kicks 5 times!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
