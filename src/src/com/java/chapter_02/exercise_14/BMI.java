package com.java.chapter_02.exercise_14;

import java.util.Scanner;

public class BMI {
    private static final double KILOGRAMS_PER_POUND = 0.45359237;
    private static final double METERS_PER_INCH = 0.0254;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds = ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in inches = ");
        double height = scanner.nextDouble();

        weight = weight * KILOGRAMS_PER_POUND;
        height = height * METERS_PER_INCH;

        double bmi = weight / Math.pow(height, 2);
        System.out.println(bmi);
    }
}
