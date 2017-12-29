package pl.dplewa.spring5.di.controllers;

import pl.dplewa.spring5.di.services.GreetingServiceImpl;

/**
 * @author Dominik Plewa
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.greet();
    }

}