package pl.dplewa.spring5.di.controllers;

import org.junit.Before;
import org.junit.Test;
import pl.dplewa.spring5.di.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.GREETING, setterInjectedController.sayHello());
    }
}
