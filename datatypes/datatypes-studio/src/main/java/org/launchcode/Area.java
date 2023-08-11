package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius?");
        int radius = input.nextInt();
        double pi = 3.14;
        double result = area(pi, radius);
        System.out.println(result);
    }

    public static double area(double num1, double num2) {
        return num1 * num2 * num2;
    }
}
