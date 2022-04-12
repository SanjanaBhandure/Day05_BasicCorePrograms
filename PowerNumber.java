package com.Bridgelabz.Day05PracticeProblems;
import java.util.Scanner;

public class PowerNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base:");
        int base = sc.nextInt();
        System.out.println("Enter the exponent");
        int exponent = sc.nextInt();
        int expo=exponent;
        long power = 1; //executes until the condition become false
        while (exponent!=0) {
            power = power * base;       //It will calculate power
            --exponent;                // It will decrement the power by 1
        }
        //System.out.println("Result:"+power);
        System.out.println(base+ " to the power "+expo+"is: "+power);     //Prints result
    }
}
