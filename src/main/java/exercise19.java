/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("In pounds, what is your weight?");
        double pounds = input.nextDouble();
        System.out.println("In inches, what is your height?");
        double inches = input.nextDouble();
        double bmi = (pounds / (inches * inches)) * 703;
        System.out.printf("Your BMI is %.1f. ", bmi);
        if(bmi >= 25)
            System.out.println("You are overweight. You should see your doctor.");
        else if(bmi <= 18.5)
            System.out.println("You are underweight. You should see your doctor.");
        else
            System.out.println("You are within the ideal weight range.");
    }
}