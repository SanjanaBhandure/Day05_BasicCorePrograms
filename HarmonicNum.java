package com.Bridgelabz.Day05PracticeProblems;
import java.util.Scanner;

public class HarmonicNum {
    public static void main(String[] args){
        System.out.println("Harmonic Number: ");
        Scanner sc = new Scanner(System.in);

        double harmonicSum = 0.0;
        int count = sc.nextInt();   //5

        for (int i = 1; i <= count; i++) {
            if (i < count)
                System.out.print("1/" + i + " + ");
            else
                System.out.print("1/" + i);
            harmonicSum += 1f/i;
        }
        System.out.println();
        System.out.println("Harmonic Number " +harmonicSum);
    }

}
