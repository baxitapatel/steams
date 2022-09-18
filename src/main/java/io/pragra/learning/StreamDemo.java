package io.pragra.learning;

import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.generate(()->"Echo");
        stream.limit(10).forEach(System.out::println);
    }
}
