/*
(Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
ax + by = e   x = ed - bf   y = af - ec
cx + dy = f       ad - bc       ad - bc
Write a program that solves the following equation and displays the value for x and y:
3.4x + 50.2y = 44.5
2.1x + .55y = 5.9
*/

package com.java.chapter_01.exercise_13;

public class Algebra {
    public static void main(String[] args) {

        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x + .55y = 5.9");

        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        double x = ((a * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }
}