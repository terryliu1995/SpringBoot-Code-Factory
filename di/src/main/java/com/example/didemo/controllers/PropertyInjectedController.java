package com.example.didemo.controllers;

import com.example.didemo.services.ConstructorGreetingServiceImpl;
import com.example.didemo.services.GreetingServicImpl;
import com.example.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public ConstructorGreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
