package com.company;

public class Main {
    /*
    This answer doesn't quite work. Here's the logic you need:
    You need an integer to represent the count for the number of steps.
    You need a while loop that increments the count for each step.
    This should be enough to get you started. Let me know if you need more help.
     */
    public static void main(String[] args) {
        System.out.println(numOfStepsToZero(14));
        System.out.println(numOfStepsToZero(8));
        System.out.println(numOfStepsToZero(123));
    }

    public static int numOfStepsToZero(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                steps++;
            }
            else {
                num = num - 1;
                steps++;
            }
        }

        return steps;
    }
}
