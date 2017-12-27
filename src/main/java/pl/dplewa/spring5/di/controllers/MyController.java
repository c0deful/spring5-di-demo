package pl.dplewa.spring5.di.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Dominik Plewa
 */
@Controller
public class MyController {

    private long callCount;

    public void helloWorld() {
        System.out.println("Hello world! No. " + ++callCount);
    }
}
