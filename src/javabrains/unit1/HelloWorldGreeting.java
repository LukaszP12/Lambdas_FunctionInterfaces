package javabrains.unit1;

import javabrains.unit1.Greeting;

public class HelloWorldGreeting implements Greeting {


    @Override
    public void perform() {
        System.out.println("Hello World");
    }
}
