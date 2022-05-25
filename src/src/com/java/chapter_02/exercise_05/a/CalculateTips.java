package com.java.chapter_02.exercise_05.a;

import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) {

        double gratuityRate, gratuityTotal, total, subtotal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter subtotal");
        subtotal = scanner.nextDouble();
        System.out.println("Enter gratuity rate");
        gratuityRate = scanner.nextDouble();

        gratuityTotal = subtotal * gratuityRate / 100;
        total = subtotal + gratuityTotal;

        System.out.printf("Gratuity total = %.2f\nTotal = %.2f", gratuityTotal, total);
    }
}
