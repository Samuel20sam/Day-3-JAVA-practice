package com.bridgelabz.empwage;

public class EmpWage
{
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    int wagePerHour = 20;
//    int fullDayHour = 16;
//    int partTimeHour = 8;
    int workingDaysPerMonth = 20;
    int workingHoursPerMonth = 100;
    int totalWage = 0;
    String companyName;

    public EmpWage (String companyName, int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth)
    {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.workingHoursPerMonth = workingHoursPerMonth;
    }
    
    public void computeEmpWage()
    {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= workingHoursPerMonth &&
        totalWorkingDays < workingDaysPerMonth)
        {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            empHrs = switch (empCheck) {
                case IS_PART_TIME -> 4;
                case IS_FULL_TIME -> 8;
                default -> 0;
            };
            totalEmpHrs += empHrs;
            System.out.println("On Day " + totalWorkingDays + " Emp Hours is :" + empHrs);

            int totalEmpWage = totalEmpHrs * wagePerHour;
            System.out.println("Total Emp Wage for the company: " + companyName+" is :" + totalEmpWage);
        }
    }

    public static void main(String[] args)
    {
        EmpWage paypal = new EmpWage("PayPal",40,25,120);
        paypal.computeEmpWage();
        EmpWage tesla = new EmpWage("Tesla",35,25,95);
        tesla.computeEmpWage();
        EmpWage airtel = new EmpWage("Airtel",30,25,105);
        airtel.computeEmpWage();
    }
}