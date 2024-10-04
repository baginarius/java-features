package com.baginarius.javafeatures.cjci;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {

    public static void main(String[] args) {
        var listOfStrings = List.of("abc", "defg", "hijklm");
        List<Integer> listOfInts = List.of(1, 2, 3, 4);


        //Reference to a Static Method
        System.out.println(listOfInts.stream().map(String::valueOf).toList());
        Function<Double, Double> doubleConsumer = Math::abs;
        System.out.println(doubleConsumer.apply(-69.92));

        //Reference to an Instance Method of a Particular Object (instance call)
        Consumer<String> stringConsumer = System.out::println;
        listOfStrings.forEach(stringConsumer::accept);

        //Reference to an Instance Method of an Arbitrary Object of a Particular Type
        List<String> upperCase = listOfStrings.stream().map(String::toUpperCase).toList();
        System.out.println(upperCase);

        //Reference to constructor
        List<StringWrapper> wrappers = listOfStrings.stream().map(StringWrapper::new).toList();
        System.out.println(wrappers);
    }

}

record StringWrapper(String value) { }