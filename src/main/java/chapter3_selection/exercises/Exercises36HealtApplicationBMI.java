package chapter3_selection.exercises;

import java.util.Scanner;

public class Exercises36HealtApplicationBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt thw user to neter weight, feet and inches
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254;         // Constant
        final double  FEET_PER_INCH = 0.0833333;       // Constant

        // Compute BMI
        weight *= KILOGRAMS_PER_POUND;
        double height = (inches += feet / FEET_PER_INCH) * METERS_PER_INCH;
        double bmi = weight / (Math.pow(height, 2));

        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
