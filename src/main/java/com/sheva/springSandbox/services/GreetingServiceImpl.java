package com.sheva.springSandbox.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServiceImpl implements GreetingService {

    public static final String GREETING_MSG = "Hello!";

    @Override
    public String sayGreeting() {
        return GREETING_MSG;
    }
}
