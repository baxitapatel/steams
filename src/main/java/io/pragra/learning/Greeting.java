package io.pragra.learning;

public interface Greeting {
    public String greet(String name);


    default int getLangCode(){
        return 1;
    }
}
