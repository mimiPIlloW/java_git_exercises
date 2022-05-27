/*
  Rewrite Programming Exercise 1.11 to prompt the user to enter the number
  of years and display the population after the number of years.
*/

package com.java.chapter_02.exercise_11;

import java.util.Scanner;

public class PopulationProjectionTestDrive {
    public static void main(String[] args) {
        PopulationProjection populationProjection = new PopulationProjection();
        Help help = new Help();

        long currentPopulation = 312032486;
        int oneBirthEverySecond = 7;
        int oneDeathEverySecond = 13;
        int oneNewImmigrantEverySecond = 45;

        help.enterNumber();

        populationProjection.population(currentPopulation,
                oneBirthEverySecond,
                oneDeathEverySecond,
                oneNewImmigrantEverySecond,
                help.getnOY());
    }
}
