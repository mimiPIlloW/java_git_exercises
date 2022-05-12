/*
(Approximate) pi can be computed using the following formula: 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 */

package com.java.chapter_01.exercise_07;

public class Approximate {
    public static void main(String[] args) {
        decision();
    }

    static public void decision() {
        double pi = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        System.out.println(pi);
    }
}