package chapter2_elemntary.exercises;

import java.util.Scanner;

public class Exercises211 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        // Prompt the user to the number of years
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        // Calculate population Projection
        int population = 312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45 )) * years);

        // Display result
        System.out.println("The poplation in " + years + " is " + population);


    }
}
