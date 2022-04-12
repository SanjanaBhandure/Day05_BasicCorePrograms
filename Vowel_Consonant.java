package com.Bridgelabz.Day05PracticeProblems;
import java.util.Scanner;

public class Check_Vowel {
    public static void main(String[] args){
        char ch;    //local variable
        Scanner scan=new Scanner(System.in);    //This statements takes input from the user
        System.out.print("Enter an Alphabet: ");    //get input and it is stored ch variable
        ch=scan.next().charAt(0);
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        {
            System.out.print(ch+ " is vowel");
        }
        else{
            System.out.print(ch+ " is constant");
        }
    }       //end of main method
}
