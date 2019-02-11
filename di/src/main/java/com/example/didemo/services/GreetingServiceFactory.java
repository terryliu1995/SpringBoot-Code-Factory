package com.example.didemo.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {

        switch (lang){
            case "en":
                return new PrimaryGreetingImpl(greetingRepository);
            case "cn":
                return new PrimaryChineseServiceImpl(greetingRepository);
            default:
                return new PrimaryGreetingImpl(greetingRepository);
        }

    }
}
