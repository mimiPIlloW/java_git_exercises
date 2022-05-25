package com.java.chapter_02.exercise_03.b;

public class ConvertMeterPerFoot {
    private static final double METERS_PER_FOOT = 0.305;

    public double convert(double feet) {
        double meters = feet * METERS_PER_FOOT;
        return meters;
    }
}
