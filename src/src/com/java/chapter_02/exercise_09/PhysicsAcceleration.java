package com.java.chapter_02.exercise_09;

public class PhysicsAcceleration {
    public void acceleration(double v0, double v1, double t) {
        double acceleration = (v1 - v0) / t;
        System.out.println(acceleration);
    }
}
