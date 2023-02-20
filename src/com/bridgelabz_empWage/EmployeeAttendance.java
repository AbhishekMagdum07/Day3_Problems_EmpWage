package com.bridgelabz_empWage;

import java.util.Random;

public class EmployeeAttendance {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC 1 = Check Employee is Present or Absent
        Random random = new Random();
        boolean b = random.nextBoolean();

        if (b == true) {
            System.out.println("UC1 = Employee is Present");
        } else {
            System.out.println("UC1 = Employee is Absent");
        }
    }
}
