package com.baginarius.javafeatures.records;

import java.util.HashSet;

public class RunRecords {
    public static void main(String[] args) {
        Person a = new Person(2);
        System.out.println(a);

        Person b = new Person("Tom", 2, new HashSet<>());
        System.out.println(b);
        // Records are immutable
        // BUT we can modify a value if it's a reference for modifiable object (Collections, other objects etc.)
        b.emails().add("tom@fb.com");
        System.out.println(b);

        Person c = new Person();
        System.out.println(c);
    }
}
