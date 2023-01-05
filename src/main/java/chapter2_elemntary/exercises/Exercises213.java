package chapter2_elemntary.exercises;

import java.util.Scanner;

public class Exercises213 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a new Scanner object.
        final double MONTHLY_INTEREST_RATE = 0.00417;  //Initialize constant value

        // Prompt the user to enter a monthly saving amount
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();

        // Compute first mont account value
        double total = 100 * (1 + MONTHLY_INTEREST_RATE);
        // Compute second month account value
        total = ( 100 + total) * (1 + MONTHLY_INTEREST_RATE);
        // Compute third mont account value
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        // Compute forth mont account value
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        // Compute fifth mont account value
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        // Compute sixth mont account value
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);

        // Display result
        System.out.println(" After the sixth month, the account value is " + total);

    }
}
