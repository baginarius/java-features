package com.baginarius.javafeatures.cjci;

public class CountLetterInString {

    public static void main(String[] args) {
        var letters = "abcdefgabt";

        System.out.println(letters.chars().filter(it -> it == 'c').count());
        System.out.println(letters.chars().filter(it -> it == 'a').count());
        System.out.println(letters.chars().filter(it -> it == 'z').count());
    }

}
