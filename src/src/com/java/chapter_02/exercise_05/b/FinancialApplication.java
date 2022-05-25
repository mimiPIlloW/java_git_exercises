package com.java.chapter_02.exercise_05.b;

import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        CalculateTips calculateTips = new CalculateTips();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the subtotal and gratuity rate: ");
        calculateTips.setSubtotal(scanner.nextDouble());
        System.out.println("Enter gratuity rate");
        calculateTips.setGratuityRate(scanner.nextDouble());

        calculateTips.calculateGratuity(calculateTips.getSubtotal(), calculateTips.getGratuityRate());
        calculateTips.calculateTotal(calculateTips.getSubtotal(), calculateTips.getGratuityTotal());

        System.out.printf("Gratuity total = %.2f\nTotal = %.2f",
                calculateTips.getGratuityTotal(),
                calculateTips.getTotal());
    }
}
