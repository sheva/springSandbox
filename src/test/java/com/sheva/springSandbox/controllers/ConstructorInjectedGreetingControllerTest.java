package com.sheva.springSandbox.controllers;

import com.sheva.springSandbox.services.GreetingServiceImpl;
import com.sheva.springSandbox.services.GreetingServiceSpecialImpl;
import org.junit.Assert;
import org.junit.Test;

public class ConstructorInjectedGreetingControllerTest {

    private ConstructorInjectedGreetingController constructorInjectedController;

    @Test
    public void testGreetingSpecial() {
        this.constructorInjectedController = new ConstructorInjectedGreetingController(new GreetingServiceSpecialImpl());
        Assert.assertEquals(GreetingServiceSpecialImpl.GREETING_MSG, constructorInjectedController.greeting());
    }

    @Test
    public void testGreeting() {
        this.constructorInjectedController = new ConstructorInjectedGreetingController(new GreetingServiceImpl());
        Assert.assertEquals(GreetingServiceImpl.GREETING_MSG, constructorInjectedController.greeting());
    }
}
