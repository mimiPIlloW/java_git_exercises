/*
(Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
For simplicity, assume a year has 365 days. Here is a sample run:
*/

package com.java.chapter_02.exercise_07.a;

import java.util.Scanner;

public class FindTheNumberOfYears {
    public static void main(String[] args) {
        OneYear oneYear = new OneYear();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please minute");
        long minuteS = scanner.nextLong();

        long years = minuteS / oneYear.getMINUTES_PER_YEARS();
        long days = minuteS / oneYear.getMINUTES_PER_DAYS() % oneYear.getDAYS_PER_YEARS();

        System.out.println(years);
        System.out.println(days);
    }
}
