package io.pragra.learning;

import java.util.Arrays;
import java.util.Date;

public class RunGreeting {
    public static void main(String[] args) {
        Arrays.asList("");

        Greeting greeting = name -> "Hello " +name;
        System.out.println(greeting.greet("Baxita"));


        Greeting greeting1= name -> "Kai se Ho " +name;
        System.out.println(greeting1.greet("Dharmen"));

        Greeting g = name -> " Kem 60 " +name;
        System.out.println(g.greet("Eva"));

        Greeting G = name -> "Hola " +name;
        System.out.println(G.greet("Joel"));

        Quote quote = (langEnum, date) -> {
     if(langEnum == LangEnum.ENGLISH){
         return new Date() + "sample quote";

     }
     return new Date() + " any quote";
 };
 Greeting GG = RunGreeting::doSomeThing;
        System.out.println(GG.greet("Papa"));
    }
public static String doSomeThing(String name ){
        return "Hello" +name;
}

    }


