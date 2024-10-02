package com.baginarius.javafeatures.interfacemethods;

public interface WithDefault2 {
    default void doSth() {
        System.out.println("From interface");
    }

}
