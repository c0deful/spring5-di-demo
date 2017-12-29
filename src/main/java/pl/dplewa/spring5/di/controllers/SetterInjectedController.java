package pl.dplewa.spring5.di.controllers;

import pl.dplewa.spring5.di.services.GreetingService;

/**
 * @author Dominik Plewa
 */
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.greet();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
