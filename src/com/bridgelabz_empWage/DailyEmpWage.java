package com.bridgelabz_empWage;

import java.util.Random;

public class DailyEmpWage {
    // UC 2 = Calculate Daily Employee Wage
    public static void main(String[] args) {
        int fullDayHours = 8;
        int wagePerHour = 20;
        int dailyWage = 0;

        dailyWage = fullDayHours * wagePerHour;

        Random random = new Random();
        boolean b = random.nextBoolean();

        if (b == true) { // Employee is present.
            System.out.println("Daily Employee wage is = " + dailyWage);
        } else { // Employee is absent.
            System.out.println("Daily Employee wage is = 0");
        }
    }
}
