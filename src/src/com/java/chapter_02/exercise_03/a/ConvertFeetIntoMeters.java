/*
(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
*/

package com.java.chapter_02.exercise_03.a;

import java.util.Scanner;

public class ConvertFeetIntoMeters {
    private static final double METERS_PER_FOOT = 0.305;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter feet");
        double feet = scanner.nextDouble();

        double meters = feet * METERS_PER_FOOT;

        System.out.printf("Meters = %.4f", meters);
    }
}
