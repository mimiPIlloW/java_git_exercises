/*
(Display five messages) Write a program that displays Welcome to Java five times.
*/

package com.java.chapter_01.exercise_02;

public class DisplayFiveMessages {

    public static void main(String[] args) {
        display();
    }

    static public void display() {
        for (int massages = 0; massages < 5; massages++) {
            System.out.println("Welcome to Computer Science, and Programming is fun.");
        }
    }
}