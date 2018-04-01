package com.sheva.springSandbox;

import com.sheva.springSandbox.components.PropertyInjectedGreetingComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringSandboxApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringSandboxApplication.class, args);
		PropertyInjectedGreetingComponent controller = (PropertyInjectedGreetingComponent) context.getBean("propertyInjectedGreetingComponent");
		System.out.println(controller.greeting());
	}
}
