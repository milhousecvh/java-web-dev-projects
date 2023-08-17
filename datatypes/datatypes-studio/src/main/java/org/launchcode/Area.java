package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius?");
        double radius = input.nextDouble();
        double result = Circle.getArea(radius);
        System.out.printf(String.format("The area of a circle of radius %s is: %s%n", radius, result));
    }
//
//    public static double area(double num1, double num2) {
//        return num1 * num2 * num2;
//    }
}