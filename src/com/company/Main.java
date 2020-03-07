package com.company;

public class Main {

    public static void main(String[] args) {

	    countAndSay(10);
    }

    public static void countAndSay(int numOfLines) {
        String output = "1";
        for (int i = 1; i <= numOfLines; i++) {
            System.out.println(output);
            output += "1";
        }
    }
}
