/*
(Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
*/

package com.java.chapter_02.exercise_06.b;

import java.util.Scanner;

public class SumTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer between 0 and 1000");

        boolean a = true;
        while (a == true) {
            int integer = input.nextInt();
            if (integer <= -1 || integer >= 1001) {
                System.out.println("Enter please integer between 0 and 1000");
            } else {
                System.out.println("Integer number is = " + integer + "\n"
                        + "The digits = " + sumDigits(integer));
                a = false;
            }
        }
    }

    private static int sumDigits(int integer) {
        int sum = 0;
        while (integer != 0) {
            sum += integer % 10;
            integer /= 10;
        }
        return sum;
    }
}
