package com.baginarius.javafeatures.cjci;

public class MethodSignature {

    void methodA(String input) {
        System.out.println(input);
    }

    void methodA(int input) {
        System.out.println(input);
    }

    void methodA(byte input) {
        System.out.println(input);
    }

    // different exception doesn't change method signature
    // this will not compile
//    void methodA(String input) throws Exception {
//        System.out.println(input);
//    }

    // different return type doesn't change method signature
    //this will not compile
//    String methodA(String input) {
//        System.out.println(input);
//        return input.toUpperCase();
//    }

}
