package pl.dplewa.spring5.di.services;

import org.springframework.stereotype.Service;

/**
 * @author Dominik Plewa
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String GREETING =  "Hello World!";

    @Override
    public String greet() {
        return GREETING;
    }
}
