package com.Bridgelabz.Day05PracticeProblems.Day05_FunctionalPrograms;
import java.util.Scanner;

public class Quadratic {
    //static variables
    public static double a,b,c,delta,root1,root2;
    //static method created
    public static void QuadraticRoots() {
        //Taking input from the user
        System.out.println("Enter the values of a,b & c : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        //delta formula
        delta =  ((Math.pow(b, 2)) - (4*a*c));
        System.out.println(delta);
        if(delta>0)
        {
            root1 =  (double)((-b + Math.sqrt(delta))/(2*a));
            root2 =  (double)((-b + Math.sqrt(delta))/(2*a));
            System.out.println("Roots of the Equation ax^2+bx+c: " );
            System.out.println("Root1: "+root1+" Root2: "+root2);
        }
        else
            System.out.println("Imaginary roots have entered");
    }

    public static void main(String[] args) {
        QuadraticRoots(); //calling method
    }
}
