/*
(Convert pounds into kilograms) Write a program that converts pounds into kilograms.
The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilograms.
*/

package com.java.chapter_02.exercise_04.b;

import java.util.Scanner;

public class ConvertPoundsIntoKilograms {
    public static void main(String[] args) {
        PoundsIntoKilograms poundsIntoKilograms = new PoundsIntoKilograms();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = scanner.nextDouble();

        // Convert pounds into kilograms
        double kilograms = poundsIntoKilograms.convert(pounds);

        System.out.println(kilograms);

    }
}
