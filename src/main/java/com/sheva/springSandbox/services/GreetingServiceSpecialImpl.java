package com.sheva.springSandbox.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Qualifier("specialGreeting")
@Profile({"en", "default"})
public class GreetingServiceSpecialImpl implements GreetingService {

    public static final String GREETING_MSG = "Hello, my darling!";

    @Override
    public String sayGreeting() {
        return GREETING_MSG;
    }
}
