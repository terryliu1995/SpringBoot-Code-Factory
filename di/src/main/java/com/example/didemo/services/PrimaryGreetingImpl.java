package com.example.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "use Primary annotation";
    }
}
