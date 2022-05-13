/*
(Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,and 35 seconds.
Write a program that displays the average speed in kilometers per hour.
(Note that 1 mile is 1.6 kilometers.)
*/

package com.java.chapter_01.exercise_12;

public class AverageSpeedInKilometers {
    public static void main(String[] args) {

        int runnerRunsInMiles = 24;
        int hourInMinute = 60;
        int minute = 40;
        int seconds = 35;

        double oneMileInKilometers = 1.6;

        double distanceInKilometers = runnerRunsInMiles * oneMileInKilometers;
        double timeInSeconds = (hourInMinute * hourInMinute) + (hourInMinute * minute) + seconds;
        double kilometersHour = 3600 * distanceInKilometers / timeInSeconds;

        System.out.println(kilometersHour);
    }
}