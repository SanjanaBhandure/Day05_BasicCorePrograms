package com.Bridgelabz.Day05PracticeProblems;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args){
        System.out.println("Taking values from Users");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the Second number");
        int num2=sc.nextInt();

        //temp is used as temporary variable to swap numbers
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping two numbers");
        System.out.println("The first number is:" +num1);
        System.out.println("The second number is:" +num2);

    }

}
