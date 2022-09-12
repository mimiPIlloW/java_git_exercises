package com.java.chapter_02.exercise_12;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        int v = input.nextInt();
        int a = input.nextInt();

        int runwayLength = calculateRunwayLength(v, a);

        System.out.println(runwayLength);
    }

    private static int calculateRunwayLength(int v, int a) {
        return (int) (Math.pow(v, 2) / (2 * a));
    }
}
