package com.bridgelabz.linecomp;

import java.util.Scanner;

public class LineComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nPoint for line 1");

        System.out.println("\nEnter the value of x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the value of y1: ");
        double y1 = sc.nextDouble();

        System.out.println("Enter the value of x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter the value of y2: ");
        double y2 = sc.nextDouble();

        double powLine1X = Math.pow((x2 - x1), 2);
        double powLine1Y = Math.pow((y2 - y1), 2);
        double firstLineLength = Math.sqrt((powLine1X + powLine1Y));
        System.out.println("\nLength of line is: " + firstLineLength);
    }
}
