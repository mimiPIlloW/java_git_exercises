package com.java.chapter_02.exercise_02.b;

import java.util.Scanner;

public class CylinderTestDrive {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = scanner.nextDouble();
        System.out.println("Enter the length");
        double length = scanner.nextDouble();

        double area = cylinder.areaOfCylinder(radius);
        double volume = cylinder.volumeOfCylinder(area, length);

        System.out.printf("Area = %.3f\nVolume = %.3f ", area, volume);
    }
}
