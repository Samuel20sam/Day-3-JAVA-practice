package com.bridgelabz.linecomp;

import java.util.Scanner;

public class LineComp
{
    public static void compareCalc()
    {
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

        System.out.println("\nPoint for line 2");

        System.out.println("\nEnter the value of x3: ");
        double x3 = sc.nextDouble();
        System.out.println("Enter the value of y3: ");
        double y3 = sc.nextDouble();

        System.out.println("Enter the value of x4: ");
        double x4 = sc.nextDouble();
        System.out.println("Enter the value of y4: ");
        double y4 = sc.nextDouble();

        double powLine2X = Math.pow((x4 - x3), 2);
        double powLine2Y = Math.pow((y4 - y3), 2);

        double secondLineLength = Math.sqrt((powLine2X + powLine2Y));
        System.out.println("\nLength of line is: " + secondLineLength);

        Double firstLineLengthObj = firstLineLength;
        Double secondLineLengthObj = secondLineLength;

        int compareValue = firstLineLengthObj.compareTo(secondLineLengthObj);
        if (compareValue == 0) {
            System.out.println("\nTwo lines are equal");
        } else if (compareValue < 0) {
            System.out.println("\nSecond line is larger");
        } else {
            System.out.println("\nFirst line is larger");
        }
    }

    public static void main(String[] args)
    {
        compareCalc();
    }
}
