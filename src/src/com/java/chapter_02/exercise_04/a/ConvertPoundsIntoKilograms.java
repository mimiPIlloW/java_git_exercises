/*
(Convert pounds into kilograms) Write a program that converts pounds into kilograms.
The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilograms.
*/

package com.java.chapter_02.exercise_04.a;

import java.util.Scanner;

public class ConvertPoundsIntoKilograms {
    private static final double KILOGRAMS_PER_POUND = 0.454;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pounds");
        double pounds = scanner.nextDouble();

        double kilograms = pounds * KILOGRAMS_PER_POUND;

        System.out.printf("Kilograms = %.4f", kilograms);

    }
}
