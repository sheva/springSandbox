package com.sheva.springSandbox.components;

import com.sheva.springSandbox.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PropertyInjectedGreetingComponent {

    @Autowired
    @Qualifier("specialGreeting")
    private GreetingService greetingServiceIml;

    public String greeting() {
        return greetingServiceIml.sayGreeting();
    }
}
