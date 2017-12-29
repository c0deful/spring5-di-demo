package pl.dplewa.spring5.di.services;

/**
 * @author Dominik Plewa
 */
public class GreetingServiceImpl implements GreetingService {

    public static final String GREETING =  "Hello World!";

    @Override
    public String greet() {
        return GREETING;
    }
}
