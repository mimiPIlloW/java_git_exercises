/*
(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
*/

package com.java.chapter_02.exercise_03.b;

import java.util.Scanner;

public class MeterPerFoot {
    public static void main(String[] args) {
        ConvertMeterPerFoot convertMeterPerFoot = new ConvertMeterPerFoot();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter feet");
        double feet = scanner.nextDouble();

        double meters = convertMeterPerFoot.convert(feet);

        System.out.println(meters);
    }
}
