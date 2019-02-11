package com.example.didemo.services;


import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "I'm in setter greeting service";
    }
}
