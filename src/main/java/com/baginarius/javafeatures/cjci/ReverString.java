package com.baginarius.javafeatures.cjci;

public class ReverString {

    public static void main(String[] args) {
        var input = "abcd";
        String output = new StringBuilder(input).reverse().toString();
        System.out.println(input);
        System.out.println(output);
    }
}
