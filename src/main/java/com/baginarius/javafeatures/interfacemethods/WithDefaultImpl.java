package com.baginarius.javafeatures.interfacemethods;

import static com.baginarius.javafeatures.interfacemethods.WithDefault.doSthStatic;

public class WithDefaultImpl implements WithDefault /*, WithDefault2 */ {

    @Override
    public void normal() {
        System.out.println("Normal from implementation");
        doSthStatic();
    }
}
