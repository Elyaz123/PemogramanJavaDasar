package chapter2_elemntary.latihan;

import java.util.Scanner;

public class Listing24ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159; // Declare a constant

        // Create a Scanner object
       Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.print("Enter a number far radius: ");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * PI;

        // Display result
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }
}
