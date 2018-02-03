package pl.dplewa.spring5.di.controllers;

import org.junit.Before;
import org.junit.Test;
import pl.dplewa.spring5.di.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * @author Dominik Plewa
 */
public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.GREETING, constructorInjectedController.sayHello());
    }
}