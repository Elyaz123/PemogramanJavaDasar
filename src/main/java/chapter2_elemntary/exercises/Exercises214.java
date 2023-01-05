package chapter2_elemntary.exercises;

import java.util.Scanner;

public class Exercises214 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Pormpt the user to enter heigt in inches
        System.out.print("Enter height in incesh: ");
        double heigt = input.nextDouble();

        // Convert weight to kilograms
        weight = weight * KILOGRAMS_PER_POUND;

        // Convert height to meters
        heigt = heigt * METERS_PER_INCH;

        // Compute BMI
        double bodyMassIndex = weight / Math.pow(heigt, 2);

        //Display result
        System.out.println("BMI is " + bodyMassIndex);
    }
}
