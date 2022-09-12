/*
(Financial application: compound value) Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly interest
rate is 0.05/12 = 0.00417. After the first month, the value in the account
becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month. (In Exercise 5.30, you will use a
loop to simplify the code and display the account value for any month.)
*/
package com.java.chapter_02.exercise_13;

import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("print sum = ");
        int sum = scanner.nextInt();
        System.out.print("monthly interest rate = ");
        double m = monthlyInterestRate(scanner.nextDouble());
        System.out.print("print month = ");
        int b = scanner.nextInt();
        double i = 0;

        for (int a = 1; a <= 12; a++) {
            if (a == 1) {
                i = sum * (1 + m);
            }
            if (a >= 2) {
                i = (sum + i) * (1 + m);
            }
            if (a == b) {
                System.out.println("Month = " + a + " monthly interest rate = " + i);
                break;
            }
        }
    }

    public static double monthlyInterestRate(double a) {
        return ((a * 0.01) / 12);
    }
}
