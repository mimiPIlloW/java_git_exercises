/*
(Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
*/

package com.java.chapter_02.exercise_06.a;

import java.util.Scanner;

public class SumTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer between 0 and 1000");

        boolean a = true;
        while (a == true) {
            int integer = scanner.nextInt();
            if (integer <= -1 || integer >= 1001) {
                System.out.println("Enter please integer between 0 and 1000");
            } else {
                int firstDigits = integer % 10;
                int remainingNumber = integer / 10;
                int secondDigits = remainingNumber % 10;
                remainingNumber = remainingNumber / 10;
                int thirdDigits = remainingNumber % 10;

                int result = thirdDigits + secondDigits + firstDigits;

                System.out.println("Integer number is = " + integer + "\n" + "The digits = " + result);
                a = false;
            }
        }
    }
}