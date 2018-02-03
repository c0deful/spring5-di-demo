package pl.dplewa.spring5.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.dplewa.spring5.di.services.GreetingServiceImpl;

/**
 * @author Dominik Plewa
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.greet();
    }

}