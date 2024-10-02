package com.baginarius.javafeatures.cjci;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] digits = {11, 2, 31, 14, 5};
        System.out.println(Arrays.toString(Arrays.stream(digits).sorted().toArray()));

        System.out.println(Arrays.toString(digits));
        Arrays.sort(digits);
        System.out.println(Arrays.toString(digits));
    }

}
