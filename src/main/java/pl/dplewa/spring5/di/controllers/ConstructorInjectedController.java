package pl.dplewa.spring5.di.controllers;

import pl.dplewa.spring5.di.services.GreetingService;

/**
 * @author Dominik Plewa
 */
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(final GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.greet();
    }
}
