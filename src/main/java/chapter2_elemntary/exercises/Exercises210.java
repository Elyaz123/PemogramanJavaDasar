package chapter2_elemntary.exercises;

import java.util.Scanner;

public class Exercises210 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter the amount of water in kilograms .
        System.out.print("Enter tehe amount of water in kilograms: ");
        double kilograms = input.nextDouble();
        // Prompt the user to enter the initial temperature.
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        // Prompt the user to enter the final temperature.
        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();
        
        // Calculate energy
        double energy = kilograms * (finalTemperature - initialTemperature) * 4184;
        
        // Display result
        System.out.println("The energy needed is " + energy );
    }
}
