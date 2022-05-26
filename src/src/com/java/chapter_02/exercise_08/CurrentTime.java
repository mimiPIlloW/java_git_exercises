/*
  Listing 2.7, ShowCurrentTime.java, gives a program that displays the current
  time in GMT. Revise the program so that it prompts the user to enter the
  time zone offset to GMT and displays the time in the specified time zone.
*/

package com.java.chapter_02.exercise_08;

import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    // Create new Scanner object

        // Prompt user to enter the time offset of GMT
        System.out.println("Enter the time zone offset to GMT: ");
        int offset = scanner.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;
        currentHour = currentHour + offset;

        // Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
