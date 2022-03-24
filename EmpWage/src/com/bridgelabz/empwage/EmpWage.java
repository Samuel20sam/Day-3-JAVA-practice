package com.bridgelabz.empwage;

import java.util.Random;

public class EmpWage
{
    static int empWagePerHour = 20;
    static int fullTimeHours = 0;
    static int partTimeHours = 0;
    static int workingDaysPerMonth = 0;
    static int monthlyWorkHours = 0;

    public static void calcEmpWage(){

        while(workingDaysPerMonth<20 || monthlyWorkHours<100)
        {
            Random r = new Random();
            int attendance = r.nextInt(3);
            System.out.println("\nRandom value is: " +attendance);

            switch (attendance) {
                case 1 -> {
                    fullTimeHours = fullTimeHours + 8;
                    System.out.println(fullTimeHours);
                }
                case 2 -> {
                    partTimeHours = partTimeHours + 4;
                    System.out.println(partTimeHours);
                }
                default -> System.out.println("\nEmployee is Absent");
            }
            workingDaysPerMonth++;
            monthlyWorkHours = (fullTimeHours + partTimeHours);
        }
        System.out.println("Total working hours:" +(fullTimeHours+partTimeHours));
        int monthlyWage = empWagePerHour * monthlyWorkHours;
        System.out.println("Total wage for the month: " + monthlyWage);
    }
    public static void main(String[] args)
    {
       calcEmpWage();
    }
}