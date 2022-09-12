/*
(Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:
											v^2
									length = ---
											 2a
Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2), and displays the minimum runway
length.
*/

package com.java.chapter_02.exercise_12;

import java.util.Scanner;

public class FindingRunwayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter v in meters/second = ");
        int v = (int) Math.pow(scanner.nextDouble(),2);
        System.out.print("acceleration a in meters/second = ");
        int a = 2 * scanner.nextInt();

        System.out.print("runway length = " + v/a);
    }
}
