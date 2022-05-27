package com.java.chapter_02.exercise_11;

import java.util.Scanner;

public class Help {
    private long nOY = 0;

    public long getnOY() {
        return nOY;
    }

    public void enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of years");
        long numberOfYears = scanner.nextLong();
        nOY = numberOfYears;
    }
}
