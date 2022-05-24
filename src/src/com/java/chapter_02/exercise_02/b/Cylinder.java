package com.java.chapter_02.exercise_02.b;

public class Cylinder {
    protected double areaOfCylinder(double radius) {
        return radius * radius * Math.PI;
    }

    protected double volumeOfCylinder(double area, double length) {
        return area * length;
    }
}
