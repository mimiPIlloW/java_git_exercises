package com.java.chapter_02.exercise_10;

public class CalculatingEnergy {
    public void energy(double k, double iT, double fT) {
        double energy = k * (fT - iT) * 4184;
        System.out.println("The energy needed is " + energy);
    }
}
