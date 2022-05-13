/*
(Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30seconds.
Write a program that displays the average speed in miles per hour.
(Note that 1 mile is 1.6 kilometers.)
*/

package com.java.chapter_01.exercise_10;

public class AverageSpeedInMiles {
    public static void main(String[] args) {
        double runnerRunsKm = 14;
        double timeMinuteAndSeconds = 45.30;
        double oneMiles = 1.6;
        System.out.println(decision(runnerRunsKm, timeMinuteAndSeconds, oneMiles));
    }

    static public double decision(double runnerRunsKm, double timeMinuteAndSeconds, double oneMiles) {
        double speedInMiles = (runnerRunsKm / oneMiles) / timeMinuteAndSeconds;
        System.out.print("Average speed in miles per hour = ");
        return speedInMiles;
    }
}