package com.bridgelabz_empWage;

import java.util.Random;

public class SwitchCase {
    // UC4 = Solve using Switch Case Statement.
    public static void main(String[] args) {
        int fullTimeHours = 8;
        int partTimeHours = 4;
        int wagePerHour = 20;
        int fullTimeWage, partTimeWage;

        fullTimeWage = fullTimeHours * wagePerHour;
        partTimeWage = partTimeHours * wagePerHour;

        Random random = new Random();
        int num = random.nextInt(2);

        switch (num){
            case(0) :
                System.out.println("Full time Employee Wage is = " + fullTimeWage);
                break;
            case(1) :
                System.out.println("Part time Employee Wage is = " + partTimeWage);
                break;
            default:
                System.out.println("Employee is Absent");

        }

    }
}
