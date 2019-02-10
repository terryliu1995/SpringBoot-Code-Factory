package com.example.services;


import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "I'm in constrictor greeting service";
    }

}
