package com.bridgelabz_empWage;

import java.util.Random;

public class PartTimeWage {
    // UC3 = Calculate Part time Employee Wage.
    public static void main(String[] args) {
        int partTimeHours = 4;
        int fullTimeHours = 8;
        int wagePerHour = 20;
        int partTimeWage = 0;
        int fullTimeWage = 0;

        partTimeWage = partTimeHours * wagePerHour;
        fullTimeWage = fullTimeHours * wagePerHour;


        Random random = new Random();
        int num = random.nextInt(3);

        if (num == 0) { // Employee is present.
            System.out.println("Part time Employee Wage is = " + partTimeWage);
        } else if(num == 1){ // Employee is absent.
            System.out.println("Full time Employee Wage is = "+fullTimeWage);
        }else {
            System.out.println("Employee is Absent");
        }
    }
}
