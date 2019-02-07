package com.example.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getChineseGreeting() {
        return "你好";
    }

    @Override
    public String getGermanGreeting() {

        return "Primärer Grußdienst";
    }
}
