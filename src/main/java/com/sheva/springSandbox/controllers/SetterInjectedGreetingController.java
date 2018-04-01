package com.sheva.springSandbox.controllers;

import com.sheva.springSandbox.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectedGreetingController {

    private GreetingService greetingServiceImpl;

    @Autowired
    public void setGreetingServiceImpl(GreetingService greetingServiceImpl) {
        this.greetingServiceImpl = greetingServiceImpl;
    }

    public String greeting() {
        return greetingServiceImpl.sayGreeting();
    }
}
