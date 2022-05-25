package com.java.chapter_02.exercise_04.b;

public class PoundsIntoKilograms {
    private final double KILOGRAMS_PER_POUND = 0.454;

    public double convert(double pounds) {
        double kilogram = pounds * KILOGRAMS_PER_POUND;
        return kilogram;
    }
}
