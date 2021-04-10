package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private final String[] myFortunes = { "You will get a rabbit!", "You will be lucky!", "You will be happy!" };

    @Override
    public String getFortune() {
        Random rand = new Random();
        return myFortunes[rand.nextInt(myFortunes.length)];
    }
}
