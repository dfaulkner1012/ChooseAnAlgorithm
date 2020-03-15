package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(numOfStepsToZero(4));
//	    countAndSay(10);
    }

    public static int numOfStepsToZero(int currentNum) {
        if (currentNum == 1)
            return 0;
        else if (currentNum % 2 == 0)
            return 1 + numOfStepsToZero(currentNum / 2);
        else
            return 1 + Math.min(numOfStepsToZero(currentNum - 1),
                    numOfStepsToZero(currentNum + 1));
    }


//    public static void countAndSay(int numOfLines) {
//        String output = "1";
//        for (int i = 1; i <= numOfLines; i++) {
//            System.out.println(output);
//            output += "1";
//        }
//    }
}
