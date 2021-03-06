package com.codurance;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HelloWorldShould {
    @Test public void
    sayHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        assertThat(helloWorld.sayHelloWorld(), is("<img src='https://upload.wikimedia.org/wikipedia/en/0/02/Homer_Simpson_2006.png'/>"));
    }

}
