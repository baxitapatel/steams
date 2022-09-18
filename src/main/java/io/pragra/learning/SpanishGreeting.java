package io.pragra.learning;

public class SpanishGreeting implements Greeting{
    @Override
    public String greet(String name) {
        return "Hola " + name + " !";
    }
}
