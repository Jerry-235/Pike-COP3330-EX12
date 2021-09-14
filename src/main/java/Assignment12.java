/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 jeremiah pike
 */


import java.util.Calendar;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        double p = input1.nextDouble();

        System.out.println("Enter the interest rate: ");
        double r = input1.nextDouble();

        System.out.println("Enter the years: ");
        double t = input1.nextDouble();

        double interest = (1+((r/100)*t)*p);

        System.out.printf("After " + t + " years, the investment will be worth: " + (p + interest) + "dollars");





    }
}