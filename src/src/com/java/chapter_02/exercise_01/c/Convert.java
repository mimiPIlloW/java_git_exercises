package com.java.chapter_02.exercise_01.c;

import java.util.Scanner;

public class Convert extends Variable {
    Scanner scanner = new Scanner(System.in);

    public void getResult() {
        System.out.println("Enter a degree in Celsius: ");
        setCelsius(scanner.nextDouble());
        setFahrenheit((getCelsius() * 9 / 5) + 32);
        System.out.println(getCelsius() + " Celsius = " + getFahrenheit() + " Fahrenheit");
    }
}
