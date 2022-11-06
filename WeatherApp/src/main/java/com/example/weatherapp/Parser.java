package com.example.weatherapp;

public class Parser {

    public static String Parser(String text) {
        text = text.replaceAll("[^0-9°]", " ");
        text = text.trim().replaceAll(" +", " ");
//        System.out.println(text);
        return text;
    }


    public String Letters(String text) {
        text = text.replaceAll("[u0000-u002fu003a-u003f]", " ");
        text = text.trim().replaceAll(" +", " ");
//        System.out.println(text);
        return text;
    }

}
