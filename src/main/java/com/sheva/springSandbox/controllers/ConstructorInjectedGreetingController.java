package com.sheva.springSandbox.controllers;

import com.sheva.springSandbox.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedGreetingController {

    private GreetingService greetingServiceImp;

    // @Autowired (optional)
    public ConstructorInjectedGreetingController(GreetingService greetingServiceImp) {
        this.greetingServiceImp = greetingServiceImp;
    }

    public String greeting() {
        return greetingServiceImp.sayGreeting();
    }
}
