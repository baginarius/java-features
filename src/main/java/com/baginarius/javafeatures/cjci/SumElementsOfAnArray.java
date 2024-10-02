package com.baginarius.javafeatures.cjci;

import java.util.Arrays;

public class SumElementsOfAnArray {

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4, 5};
        System.out.println(Arrays.stream(digits).sum());
        System.out.println(Arrays.stream(digits).min().orElseThrow());
        System.out.println(Arrays.stream(digits).max().orElseThrow());
        System.out.println(Arrays.stream(digits).average().orElseThrow());
    }

}
