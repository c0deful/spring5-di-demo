package pl.dplewa.spring5.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.dplewa.spring5.di.services.GreetingService;

/**
 * @author Dominik Plewa
 */
@Component
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    // this annotation is only for documentation purposes,
    // it is unnecessary when only one constructor exists
    @Autowired
    public ConstructorInjectedController(final GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.greet();
    }
}
