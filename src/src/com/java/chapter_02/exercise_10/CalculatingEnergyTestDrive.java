package com.java.chapter_02.exercise_10;

import java.util.Scanner;

public class CalculatingEnergyTestDrive {
    public static void main(String[] args) {
        CalculatingEnergy calculatingEnergy = new CalculatingEnergy();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: ");
        double kilograms = scanner.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double initialTemperature = scanner.nextDouble();
        System.out.println("Enter the final temperature: ");
        double finalTemperature = scanner.nextDouble();

        calculatingEnergy.energy(kilograms, initialTemperature, finalTemperature);
    }
}
