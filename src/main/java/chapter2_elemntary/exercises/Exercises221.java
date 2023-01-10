package chapter2_elemntary.exercises;

import java.util.Scanner;

public class Exercises221 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the invesment amount,
        // annual interest rate and numebr of years.
        System.out.print("Enter invesment amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter anual interest rate in percentage: ");
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate /= 1200;
        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        // Calculate future invesment value
        double futureInvesmentVAlue = amount * Math.pow(1 + monthlyInterestRate, years * 12);

        // Display result
        System.out.println("Accumlated value is $" + futureInvesmentVAlue);
    }
}
