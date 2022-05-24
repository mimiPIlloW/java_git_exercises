/*
(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
 */

package com.java.chapter_02.exercise_01.b;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Convert convert = new Convert();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Celsius");

        double celsius = scanner.nextDouble();

        double fahrenheit = convert.conversion(celsius);

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
