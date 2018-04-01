package com.sheva.springSandbox.controllers;

import com.sheva.springSandbox.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedGreetingController {

    @Autowired
    @Qualifier("specialGreeting")
    private GreetingService greetingServiceIml;

    public String greeting() {
        return greetingServiceIml.sayGreeting();
    }
}
