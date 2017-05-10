package com.sn;


import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

/**
 * Created by silvionetto on 10/05/17.
 */
@RunWith(ConcordionRunner.class)
public class HelloWorldFixture {

    private HelloWorld helloWorld;

    public String hello(String name) {
        helloWorld = new HelloWorld();
        return helloWorld.hello(name);
    }

}
