package com.example.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("cn")
public class PrimaryChineseServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "你好 in Chinese";
    }
}
