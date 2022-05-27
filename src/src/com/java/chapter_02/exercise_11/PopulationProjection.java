package com.java.chapter_02.exercise_11;

public class PopulationProjection {
    private final long SECOND_IN_ONE_YEARS = 31536000;

    public void population(long cP, int oBES, int oDES, int oNIES, long nOY) {
        long population = cP +
                (((SECOND_IN_ONE_YEARS / oBES) +
                        (SECOND_IN_ONE_YEARS / oNIES) -
                        (SECOND_IN_ONE_YEARS / oDES)) * nOY);
        System.out.println(population);
    }
}
