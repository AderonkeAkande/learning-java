package com.bootcamp.week1;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("Enter the string to check for palindrome: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reverseInput = "";

        // Fill in the code below to reverse the input string and store it in the reverseInput variable

        for (int i = input.length() - 1; i >= 0; i--) {
            reverseInput = reverseInput + input.charAt(i);
        }


        if(input.equals(reverseInput)){
            System.out.print("Input string is palindrome");
        }else {
            System.out.println("Input string is not palindrome");
        }


    }
}
