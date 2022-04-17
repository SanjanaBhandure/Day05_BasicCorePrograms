package com.Bridgelabz.Day05PracticeProblems.Day05_FunctionalPrograms;
import java.util.Scanner;

public class WindChill {
    //Declaring static variables
    public static double temp, windSpeed, windChill;
    //creating checkWindChill method using parameters
    public static void checkWindChill(double temp, double windSpeed) {
        //Formula for calculating WindChill using if-else
        if (temp < 50 || windSpeed < 120 || windSpeed > 3) {
            windChill = 35.74 + (0.6215 * temp)
                    + (0.4275 * temp * (Math.pow(windSpeed, 0.16)) - 35.75 * (Math.pow(windSpeed, 0.16)));
            System.out.println("WindChill= " +windChill);
        } else
            System.out.println(" Invalid input!!!  ");
    }

    public static void main(String[] args) {
        //Taking input from the user
        System.out.println("Enter temperature in fahrenheit wind speed in miles per hour: ");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        double windSpeed = sc.nextDouble();
        // calling function
        checkWindChill(temp, windSpeed);
    }
}
