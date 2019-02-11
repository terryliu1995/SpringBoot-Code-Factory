package com.example.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimaryChineseServiceImpl implements GreetingService {
    private GreetingRepository greetingRepository;

    public PrimaryChineseServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getChineseGreeting();
    }
}
