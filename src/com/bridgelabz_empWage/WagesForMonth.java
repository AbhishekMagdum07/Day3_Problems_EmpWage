package com.bridgelabz_empWage;

import java.util.Random;

public class WagesForMonth {
    // UC 5 = Calculating Wages for a month.

    public static void main(String[] args) {
        int fullTimeHours = 8;
        int partTimeHours = 4;
        int wagePerHour = 20;
        int workingDaysInMonth = 20;
        int fullTimeWageForMonth, partTimeWageForMonth;

        fullTimeWageForMonth = fullTimeHours * wagePerHour * workingDaysInMonth;
        partTimeWageForMonth = partTimeHours * wagePerHour * workingDaysInMonth;

        Random random = new Random() ;
        int num = random.nextInt(3);

        switch (num){
            case(0) :
                System.out.println("Full time Employee Wage for Month is = " + fullTimeWageForMonth);
                break;
            case(2) :
                System.out.println("Part time Employee Wage for Month is = " + partTimeWageForMonth);
                break;
            default:
                System.out.println("Employee is Absent");

        }



    }
}
