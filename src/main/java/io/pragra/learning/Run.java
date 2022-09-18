package io.pragra.learning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Run {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Set<Employee> set = new HashSet<>();
        list.add(new Employee("Baxita"));
        list.add(new Employee("Baxita"));
        set.add(new Employee("baxita"));
        set.add(new Employee("baxita"));
        System.out.println(list.size());
        System.out.println(set.size());
    }
}
