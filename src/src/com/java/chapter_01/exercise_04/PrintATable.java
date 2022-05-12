/*
(Print a table) Write a program that displays the following table:
a	 a^2    a^3
1	 1 		1
2	 4 		8
3	 9 		27
4	 16     64
*/

package com.java.chapter_01.exercise_04;

public class PrintATable {
    public static void main(String[] args) {
        System.out.println("a      a^2      a^3");
        display();
    }

    static public void display() {
        for (int a = 1; a <= 4; a++) {
            System.out.printf("%d  |%5d  |%6d\n", a, a * a, a * a * a);
        }
    }
}
