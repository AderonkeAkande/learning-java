package com.bootcamp.week1;

public class StepsToZero {
    public static int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            }
            else {
                num--;
            }
            steps++;
        }

        return steps;
    }


    // Do not modify the code below. You can use that for sanity check.
    public static void main(String[] args) {
        int num = 14;
        int steps = numberOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to zero: " + steps);
    }
}