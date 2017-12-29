package pl.dplewa.spring5.di.controllers;

import org.junit.Before;
import org.junit.Test;
import pl.dplewa.spring5.di.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * @author Dominik Plewa
 */
public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.GREETING, propertyInjectedController.sayHello());
    }
}