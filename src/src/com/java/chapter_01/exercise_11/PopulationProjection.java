/*
(Population projection) The U.S. Census Bureau projects population based on the following assumptions:
- One birth every 7 seconds
- One death every 13 seconds
- One new immigrant every 45 seconds
Write a program to display the population for each of the next five years.
Assume the current population is 312,032,486 and one year has 365 days.
*/

package com.java.chapter_01.exercise_11;

public class PopulationProjection {
    public static void main(String[] args) {

        double secondsPerMinutes = 60;
        double secondsPerHour = secondsPerMinutes * secondsPerMinutes;
        double secondsInADay = secondsPerHour * 24;
        double secondsINYears = secondsInADay * 365;

        double currentPopulation = 312032486;

        double birthInSeconds = 7;
        double deathInSeconds = 13;
        double oneImmigrantInSeconds = 45;

        double birth = secondsINYears / birthInSeconds;
        double death = secondsINYears / deathInSeconds;
        double immigrant = secondsINYears / oneImmigrantInSeconds;

        for (int i = 1; i <= 5; i++) {
            currentPopulation = currentPopulation + birth + immigrant - death;
            System.out.println(i + "year = " + (int) currentPopulation);
        }
    }
}
