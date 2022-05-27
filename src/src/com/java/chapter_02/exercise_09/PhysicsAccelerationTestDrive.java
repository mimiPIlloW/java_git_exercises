/*
  Average acceleration is defined as the change of velocity divided by the
  time taken to make the change, as shown in the following formula:
                          a = (v1 - v0) / t
  Write a program that prompts the user to enter the starting velocity v0
  in meters/second, the ending velocity v1 in meters/second, and the time
  span t in seconds, and displays the average acceleration.
*/

package com.java.chapter_02.exercise_09;

import java.util.Scanner;

public class PhysicsAccelerationTestDrive {
    public static void main(String[] args) {
        PhysicsAcceleration physicsAcceleration = new PhysicsAcceleration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write v0");
        double v0 = scanner.nextDouble();
        System.out.println("Write v1");
        double v1 = scanner.nextDouble();
        System.out.println("Write t");
        double t = scanner.nextDouble();

        physicsAcceleration.acceleration(v0, v1, t);
    }
}
