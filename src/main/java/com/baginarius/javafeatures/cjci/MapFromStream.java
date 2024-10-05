package com.baginarius.javafeatures.cjci;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapFromStream {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person(44, "Marek"), new Person(17, "Antek"), new Person(66, "Joe"));
        System.out.println(people);
        Map<Integer, List<Person>> collect = people.stream().collect(Collectors.groupingBy(Person::age));
        System.out.println(collect);
    }
}

record Person(int age, String name) {
}
