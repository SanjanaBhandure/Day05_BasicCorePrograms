package com.Bridgelabz.Day05PracticeProblems.Day05_FunctionalPrograms;

public class Distance {
    public static void EuclideanDistance(double x, double y) {
        double distance = Math.sqrt((x*x) + (Math.pow(y,2)));
        System.out.println("Euclidean Distance: " +distance);
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        EuclideanDistance(x,y);
    }
}
