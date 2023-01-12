package chapter3_selection.latihan;

import java.util.Scanner;

public class Listing34ComputeAndInterPretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter  weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // prompt the user to enter height in inches
        System.out.print("Enter height in inches; ");
        double height = input.nextDouble();

        final double KILLOGRAMS_PER_PUONDS = 0.45359237; // CONSTANT
        final double METERS_PER_INCH = 0.0254; // Constant

        //Compute BMI
        double weightKillograms = weight * KILLOGRAMS_PER_PUONDS;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightKillograms / (heightInMeters * heightInMeters);

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
