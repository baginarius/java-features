package com.baginarius.javafeatures.interfacemethods;

public class Main {

    public static void main(String[] args) {
        WithDefault.doSthStatic();
        new WithDefaultImpl().doSth();
        new WithDefaultImpl().normal();
        //static method may only be invoked via Interface
        //new WithDefaultImpl().doSthStatic();
    }

}
