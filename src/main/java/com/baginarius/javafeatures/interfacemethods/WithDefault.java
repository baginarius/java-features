package com.baginarius.javafeatures.interfacemethods;

public interface WithDefault {

    void normal();

    default void doSth() {
        System.out.println("From interface");
    }

    static void doSthStatic() {
        System.out.println("Static from interface");
    }
}
