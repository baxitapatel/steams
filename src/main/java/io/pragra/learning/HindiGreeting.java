package io.pragra.learning;

public class HindiGreeting implements Greeting{
    @Override
    public String greet(String name) {
        return "Kai se ho " +name ;
    }
}
