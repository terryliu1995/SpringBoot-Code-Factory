package com.example.didemo.config;

import com.example.didemo.services.GreetingRepository;
import com.example.didemo.services.GreetingService;
import com.example.didemo.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    GreetingService PrimaryGreetingImpl(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile({"cn"})
    GreetingService PrimaryChineseServiceImpl(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("cn");
    }
}
