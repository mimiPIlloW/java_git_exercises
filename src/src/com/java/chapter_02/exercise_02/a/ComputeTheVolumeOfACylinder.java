/*
(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * pi
volume = area * length
 */

package com.java.chapter_02.exercise_02.a;

import java.util.Scanner;

public class ComputeTheVolumeOfACylinder {
    public static double PI = Math.PI;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = scanner.nextDouble();
        System.out.println("Enter the length");
        double length = scanner.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.printf("Area = %.3f\nVolume = %.3f ", area, volume);
    }
}
