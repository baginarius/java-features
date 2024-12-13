package com.baginarius.javafeatures.records;

import java.util.Set;

public record Person(String name, int age, Set<String> emails) {

    // The compact constructor is not creating any additional constructor
    public Person {
        // we should not use 'this' in the compact constructor
        // due the fact that this code will be executed before assigning values to fields of the Record
        if (age < 9) {
            System.out.println("below nine");
            age += 10;
        }
    }

    public Person(int age) {
        // we should call a canonical or another constructor in the first line
        this("John", age, Set.of());
    }

    public Person() {
        // we should call a canonical or another constructor in the first line
        this(18);
    }
}
