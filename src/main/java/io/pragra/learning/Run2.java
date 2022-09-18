package io.pragra.learning;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Run2 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Bxaita", "Dharmen", "Eva", "Joel");
        names.forEach(t-> System.out.println(t));
        names.forEach(System.out::println);
        Consumer<String> consumer = t-> System.out.println(t);
        names.forEach(consumer);
        System.out.println(names);

        names.sort(String::compareTo);
        System.out.println(names);
    }
}
