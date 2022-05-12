/*
(Display a pattern) Write a program that displays the following pattern:
	    J     A    V     V    A
	    J    A A    V   V    A A
	J   J   AAAAA    V V    AAAAA
	 J J   A     A    V    A     A
*/

package com.java.chapter_01.exercise_03;

public class DisplayAPattern {
    public static void main(String[] args) {
        display();
    }

    static public void display() {
        System.out.println("    J     A    V     V    A");
        System.out.println("    J    A A    V   V    A A");
        System.out.println("J   J   AAAAA    V V    AAAAA");
        System.out.println(" J J   A     A    V    A     A");
    }
}
