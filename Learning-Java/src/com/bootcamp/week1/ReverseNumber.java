package com.bootcamp.week1;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int num = sc.nextInt();
        int reverse = 0;
        int rem;

        if (num < 0) {
            System.out.println(reverse);
        } else {
            while (num > 0) {
                rem = num % 10;
                reverse = reverse * 10 + rem;
                num = num / 10;
            }
        }
        System.out.println(reverse);
    }

}