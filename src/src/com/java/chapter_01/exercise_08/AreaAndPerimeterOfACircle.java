/*
(Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
					perimeter = 2 * radius * pi
					area = radius * radius * pi
*/

package com.java.chapter_01.exercise_08;

import java.util.ArrayList;

public class AreaAndPerimeterOfACircle {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<Double>();
        double radius = 5.5;
        System.out.println(decision(arrayList, radius));
    }

    static public ArrayList<Double> decision(ArrayList<Double> arrayList, double radius) {
        double perimeter = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;
        arrayList.add(perimeter);
        arrayList.add(area);
        System.out.println("Perimeter " + arrayList.get(0));
        System.out.println("Area " + arrayList.get(1));
        return arrayList;
    }
}